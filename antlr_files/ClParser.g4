parser grammar ClParser;

options {
  tokenVocab = ClLexer;
}

program: (classDeclaration | methodDeclaration)* main;

classDeclaration: CLASS nameDeclaration lbrace (fieldDeclaration | methodDeclarationClass | initializerDeclaration)* rbrace;

fieldDeclaration: (PLUS | MINUS) (MUTABLE | INMUTABLE)? type nameDeclaration (equal expression)? semi;

methodDeclaration: type nameDeclaration lpar (argumentList)? rpar lbrace statement* rbrace ;

methodDeclarationClass: type nameDeclaration lpar (argumentList)? rpar lbrace (classStatement)* rbrace ;

initializerDeclaration: nameDeclaration lpar (argumentList)? rpar lbrace (classStatement)* rbrace;

argumentList: argument (COMMA argument)*;
instantiationArgumentList: argumentInstantiation (COMMA argumentInstantiation)*;
argumentInstantiation: nameDeclaration | expression;

argument: type nameDeclaration;


main: MAIN lbrace statement* rbrace;

classStatement: classReturnStatement
                | statement 
                | selfStatement
                | returnExpression semi;

returnExpression: RETURN expression semi;

selfStatement: SELF assignment semi;

statement: assignment semi
         | type assignment semi 
         | ifStatement
         | whileStatement
         | forStatement
         | printStatement semi 
         | methodCall semi
         | objectAttribute semi
         | classInstantiation semi
         | returnStatement semi;

printStatement: PRINT lpar expression rpar;
objectAttribute: nameDeclaration POINT nameDeclaration equal expression;
assignment: nameDeclaration equal expression;

ifStatement: IF lpar expression rpar lbrace (statement | classReturnStatement | selfStatement)* rbrace (ELIF lpar expression rpar lbrace (statement | classReturnStatement | selfStatement)* rbrace)* (ELSE lbrace (statement | classReturnStatement | selfStatement)* rbrace)?;
whileStatement: WHILE lpar expression rpar lbrace (statement | classReturnStatement | selfStatement)* rbrace;
forStatement: FOR lpar assignment semi expression semi assignment rpar lbrace (statement | classReturnStatement | selfStatement)* rbrace;

classInstantiation: INSTANCE nameDeclaration HASH nameDeclaration equal nameDeclaration lpar (instantiationArgumentList)? rpar;

methodCall: (nameDeclaration POINT)? nameDeclaration lpar (instantiationArgumentList)? rpar;

classReturnStatement: (returnStatement | RETURN classExpression) semi;

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
                | lpar callExpression rpar 
                | classCallSelf 
                | methodCall;

classCallSelf:  nameDeclaration SELF (nameDeclaration | methodCall);

integer_expr: (DIGIT+ | MINUS DIGIT+);

floating_expr: (DIGIT+ POINT DIGIT* | DIGIT* POINT DIGIT+ | DIGIT+ EXPONENT (PLUS | MINUS) DIGIT+);

string_expr: STRINGLITERAL;

type: INT | FLOAT | STRING | BOOL;

lpar: LPAR;
rpar: RPAR;
lbrace: LBRACE;
rbrace: RBRACE;
semi: SEMI;

equal: EQUAL;

nameDeclaration: NONDIGIT NONDIGIT*;
