// Generated from Y:/Universita/Linguagg/BrainFuck/src/Brainfuck.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BrainfuckParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BrainfuckVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BrainfuckParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(BrainfuckParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code min}
	 * labeled alternative in {@link BrainfuckParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMin(BrainfuckParser.MinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mag}
	 * labeled alternative in {@link BrainfuckParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMag(BrainfuckParser.MagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plus}
	 * labeled alternative in {@link BrainfuckParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(BrainfuckParser.PlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link BrainfuckParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(BrainfuckParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vir}
	 * labeled alternative in {@link BrainfuckParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVir(BrainfuckParser.VirContext ctx);
	/**
	 * Visit a parse tree produced by the {@code punt}
	 * labeled alternative in {@link BrainfuckParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPunt(BrainfuckParser.PuntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loop}
	 * labeled alternative in {@link BrainfuckParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(BrainfuckParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nil}
	 * labeled alternative in {@link BrainfuckParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNil(BrainfuckParser.NilContext ctx);
}