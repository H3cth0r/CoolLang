parser grammar ClParser;
options {
    tokenVocab = ClLexer;
}

program: (classDeclaration | structDeclaration)* main;

classDeclaration: CLASS NONDIGIT NONDIGIT* LBRACE ( fieldDeclaration | methodDeclaration )* RBRACE;
fieldDeclaration: (PLUS | MINUS) (MUTABLE | INMUTABLE)? type NONDIGIT NONDIGIT* (EQUAL expression)? SEMI ;
methodDeclaration: type NONDIGIT NONDIGIT* LPAR (argumentList)? RPAR LBRACE statement* RBRACE;

argumentList: argument (COMMA argument)*;
argument: type NONDIGIT NONDIGIT*;

structDeclaration: STRUCT NONDIGIT NONDIGIT* LBRACE (fieldDeclaration)* RBRACE;

main: MAIN LBRACE statement RBRACE;

statement:  assignment SEMI
          | ifStatement
          | whileStatement 
          | forStatement 
          | classInstantiation SEMI 
          | methodCall SEMI 
          | returnStatement SEMI 
          ;
assignment: NONDIGIT NONDIGIT* EQUAL expression;
ifStatement: IF LPAR expression RPAR LBRACE statement  RBRACE (ELIF LPAR expression RPAR LBRACE statement* RBRACE)* (ELSE LBRACE statement* RBRACE)?;

whileStatement: WHILE LPAR expression RPAR LBRACE statement* RBRACE ;
forStatement: FOR LPAR assignment SEMI expression SEMI assignment RPAR LBRACE statement* RBRACE;

classInstantiation: NONDIGIT NONDIGIT* EQUAL NONDIGIT NONDIGIT* LPAR (argumentList)? RPAR;
methodCall: (NONDIGIT NONDIGIT* POINT)? NONDIGIT NONDIGIT* LPAR (argumentList)? RPAR;
returnStatement: RETURN expression;

expression: NONDIGIT NONDIGIT*
  |   integer_expr 
  |   floating_expr 
  |   string_expr 
  |   TRUE 
  |   FALSE 
  |   expression PLUS expression 
  |   expression MINUS expression 
  |   expression BY expression 
  |   expression DIV expression 
  |   expression MOD expression 
  |   LPAR expression RPAR 
  |   methodCall 
  ;

  integer_expr: (DIGIT+ | MINUS DIGIT+);
  floating_expr : (DIGIT+ POINT DIGIT* | DIGIT* POINT DIGIT+ | DIGIT+ EXPONENT (PLUS | MINUS) DIGIT+);
  string_expr : STRINGLITERAL;

  type: INT | FLOAT | STRING | BOOL ;
