parser grammar ClParser;

options {
  tokenVocab = ClLexer;
}

program: (classDeclaration | structDeclaration)* main;

classDeclaration: CLASS NONDIGIT NONDIGIT* LBRACE (fieldDeclaration | methodDeclarationClass | initializerDeclaration)* RBRACE;

fieldDeclaration: (PLUS | MINUS) (MUTABLE | INMUTABLE)? type NONDIGIT NONDIGIT* (EQUAL expression)? SEMI;

methodDeclaration: type NONDIGIT NONDIGIT* LPAR (argumentList)? RPAR LBRACE statement* RBRACE ;

methodDeclarationClass: type NONDIGIT NONDIGIT* LPAR (argumentList)? RPAR LBRACE (classStatement)* RBRACE ;

initializerDeclaration: NONDIGIT NONDIGIT* LPAR (argumentList)? RPAR LBRACE (classStatement)* RBRACE;

argumentList: argument (COMMA argument)*;

argument: type NONDIGIT NONDIGIT*;

structDeclaration: STRUCT NONDIGIT NONDIGIT* LBRACE (fieldDeclaration)* RBRACE;

main: MAIN LBRACE statement RBRACE;

classStatement: classReturnStatement
                | statement SEMI
                | selfStatement
                | returnExpression SEMI;

returnExpression: RETURN expression SEMI;

selfStatement: SELF assignment SEMI;

statement: assignment SEMI
         | ifStatement
         | whileStatement
         | forStatement
         | classInstantiation SEMI
         | methodCall SEMI
         | returnStatement SEMI;

assignment: NONDIGIT NONDIGIT* EQUAL expression; // Added SEMI here

ifStatement: IF LPAR expression RPAR LBRACE statement RBRACE (ELIF LPAR expression RPAR LBRACE statement* RBRACE)* (ELSE LBRACE statement* RBRACE)?;

whileStatement: WHILE LPAR expression RPAR LBRACE statement* RBRACE;

forStatement: FOR LPAR assignment SEMI expression SEMI assignment RPAR LBRACE statement* RBRACE;

classInstantiation: NONDIGIT NONDIGIT* EQUAL NONDIGIT NONDIGIT* LPAR (argumentList)? RPAR LBRACE fieldDeclaration* RBRACE;

methodCall: (NONDIGIT NONDIGIT* POINT)? NONDIGIT NONDIGIT* LPAR (argumentList)? RPAR;

classReturnStatement: (returnStatement | RETURN classExpression) SEMI;

returnStatement: RETURN expression SEMI;

classExpression: expression | selfClassCall;

selfClassCall: SELF NONDIGIT NONDIGIT*;

expression: SELF callExpression  // Access member using SELF
          | callExpression;

callExpression: NONDIGIT NONDIGIT*   // Handles method calls and member access
                (POINT callExpression)?
                | (SELF NONDIGIT NONDIGIT*)?  // Added this line for member access with SELF
                | integer_expr
                | floating_expr
                | string_expr
                | TRUE
                | FALSE
                | callExpression PLUS callExpression
                | callExpression MINUS callExpression
                | callExpression STAR callExpression
                | callExpression DIV callExpression
                | callExpression MOD callExpression
                | LPAR callExpression RPAR
                | methodCall;

integer_expr: (DIGIT+ | MINUS DIGIT+);

floating_expr: (DIGIT+ POINT DIGIT* | DIGIT* POINT DIGIT+ | DIGIT+ EXPONENT (PLUS | MINUS) DIGIT+);

string_expr: STRINGLITERAL;

type: INT | FLOAT | STRING | BOOL;
