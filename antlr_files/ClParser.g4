parser grammar ClParser;

options {
  tokenVocab = ClLexer;
}

program: (classDeclaration | methodDeclaration)* main;

classDeclaration: CLASS nameDeclaration LBRACE (fieldDeclaration | methodDeclarationClass | initializerDeclaration)* RBRACE;

fieldDeclaration: (PLUS | MINUS) (MUTABLE | INMUTABLE)? type nameDeclaration (EQUAL expression)? SEMI;

methodDeclaration: type nameDeclaration LPAR (argumentList)? RPAR LBRACE statement* RBRACE ;

methodDeclarationClass: type nameDeclaration LPAR (argumentList)? RPAR LBRACE (classStatement)* RBRACE ;

initializerDeclaration: nameDeclaration LPAR (argumentList)? RPAR LBRACE (classStatement)* RBRACE;

argumentList: argument (COMMA argument)*;
instantiationArgumentList: argumentInstantiation (COMMA argumentInstantiation)*;
argumentInstantiation: nameDeclaration | expression;

argument: type nameDeclaration;


main: MAIN LBRACE statement* RBRACE;

classStatement: classReturnStatement
                | statement 
                | selfStatement
                | returnExpression SEMI;

returnExpression: RETURN expression SEMI;

selfStatement: SELF assignment SEMI;

statement: assignment SEMI
         | type assignment SEMI 
         | ifStatement
         | whileStatement
         | forStatement
         | methodCall SEMI
         | objectAttribute SEMI
         | classInstantiation SEMI
         | returnStatement SEMI;

objectAttribute: nameDeclaration POINT nameDeclaration EQUAL expression;
assignment: nameDeclaration EQUAL expression;

ifStatement: IF LPAR expression RPAR LBRACE (statement | classReturnStatement | selfStatement)* RBRACE (ELIF LPAR expression RPAR LBRACE (statement | classReturnStatement | selfStatement)* RBRACE)* (ELSE LBRACE (statement | classReturnStatement | selfStatement)* RBRACE)?;
whileStatement: WHILE LPAR expression RPAR LBRACE (statement | classReturnStatement | selfStatement)* RBRACE;
forStatement: FOR LPAR assignment SEMI expression SEMI assignment RPAR LBRACE (statement | classReturnStatement | selfStatement)* RBRACE;

classInstantiation: INSTANCE nameDeclaration HASH nameDeclaration EQUAL nameDeclaration LPAR (instantiationArgumentList)? RPAR;

methodCall: (nameDeclaration POINT)? nameDeclaration LPAR (instantiationArgumentList)? RPAR;

classReturnStatement: (returnStatement | RETURN classExpression) SEMI;

returnStatement: RETURN expression;

classExpression: expression | selfClassCall;

selfClassCall: SELF nameDeclaration;

expression: SELF callExpression  // Access member using SELF
          | callExpression;

callExpression: nameDeclaration   // Handles method calls and member access
                (POINT callExpression)?
                | (SELF nameDeclaration)?  // Added this line for member access with SELF
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
                | callExpression EQEQUAL callExpression
                | callExpression NOTEQUAL callExpression
                | callExpression GREATER callExpression
                | callExpression SMALLER callExpression
                | callExpression GREATEREQUAL callExpression
                | callExpression SMALLEREQUAL callExpression
                | LPAR callExpression RPAR
                | classCallSelf 
                | methodCall;

classCallSelf:  nameDeclaration SELF (nameDeclaration | methodCall);

integer_expr: (DIGIT+ | MINUS DIGIT+);

floating_expr: (DIGIT+ POINT DIGIT* | DIGIT* POINT DIGIT+ | DIGIT+ EXPONENT (PLUS | MINUS) DIGIT+);

string_expr: STRINGLITERAL;

type: INT | FLOAT | STRING | BOOL;

nameDeclaration: NONDIGIT NONDIGIT*;
