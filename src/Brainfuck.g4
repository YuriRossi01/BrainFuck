grammar Brainfuck;

main :  init EOF ;

init : MIN init                 # min
     | MAG init                 # mag
     | PLUS init                # plus
     | SUB init                 # sub
     | VIR  init                # vir
     | PUNT init                # punt
     | LBRAK init RBRAK init    # loop
     |                          # nil
     ;


MIN : '<' ;
MAG : '>' ;
PLUS : '+' ;
SUB  : '-' ;
VIR  : ',' ;
PUNT : '.' ;
LBRAK  : '[' ;
RBRAK  : ']' ;
WS   : [ \t\n\r]+ -> skip ;
