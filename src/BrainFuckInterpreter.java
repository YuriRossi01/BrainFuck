import java.util.*;
public class BrainFuckInterpreter extends BrainfuckBaseVisitor<Byte>{
    private  int  rif ;
    private final List<Byte> list = new ArrayList<>();
    @Override
    public Byte visitMain(BrainfuckParser.MainContext ctx) {
        this.rif = 0;
        this.list.add((byte) 0);
        visit(ctx.init());
        return null;
    }
    @Override
    public Byte visitMin(BrainfuckParser.MinContext ctx) {
        --rif;
        if(rif < 0){
            list.addFirst((byte) 0);
            ++rif;
        }
        return  visit(ctx.init());
    }
    @Override
    public Byte visitMag(BrainfuckParser.MagContext ctx) {
        ++rif;
        if(rif >= list.size())
            list.add(rif, (byte) 0);
        return  visit(ctx.init());
    }
    @Override
    public Byte visitPlus(BrainfuckParser.PlusContext ctx) {
        list.set(rif, (byte) (list.get(rif)+1));
        return  visit(ctx.init());
    }
    @Override
    public Byte visitSub(BrainfuckParser.SubContext ctx) {
        list.set(rif, (byte) (list.get(rif)-1));
        return  visit(ctx.init());
    }
    @Override
    public Byte visitPunt(BrainfuckParser.PuntContext ctx) {
        byte out = list.get(rif);
        System.out.print((char) out);
        return visit(ctx.init());
    }
    @Override
    public Byte visitVir(BrainfuckParser.VirContext ctx) {
        System.out.print("input: ");
        Scanner scan = new Scanner(System.in);
        String in = scan.next();
        if(in.charAt(0) == '\\' && in.charAt(1) == '0') {
            return null;
        }
        else{
            byte in2 = (byte)in.charAt(0);
            list.set(rif, in2);
        }
        return visit(ctx.init());
    }
    @Override
    public Byte visitLoop(BrainfuckParser.LoopContext ctx) {
        while (list.get(rif)!= 0) {
            visit(ctx.init(0));
        }
        return visit(ctx.init(1));
    }
    @Override
    public Byte visitNil(BrainfuckParser.NilContext ctx) {
        return null;
    }
}
