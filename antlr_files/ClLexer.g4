lexer grammar ClLexer;

WS : [ \t\r\n]+ -> skip ;

MAIN: 'main';

IF:     'if';
ELIF:   'elif';
ELSE:   'else';

WHILE:  'while';
FOR:    'for';

INSTANCE:'instance';
CLASS:  'class';
STRUCT: 'struct';
SELF:   '->';

RETURN: '<-';

PLUS:   '+';
MINUS:  '-';
STAR:   '*';
DIV:    '/';
MOD:    '%';
EQUAL:  '=';

COLON:  ':';
SEMI:   ';';
COMMA:  ',';
LBRACE: '{';
RBRACE: '}';
LPAR:   '(';
RPAR:   ')';
POINT:  '.';
HASH:   '#';

INT:    'integer';
FLOAT:  'float';
STRING: 'string';
BOOL:   'bool';

TRUE:   'true';
FALSE:  'false';

PRINT:  'print';

EQEQUAL:'==';
NOTEQUAL:'!=';
GREATER:'>';
SMALLER:'<';
GREATEREQUAL:'>=';
SMALLEREQUAL:'<=';

MUTABLE:'mutable';
INMUTABLE:'inmutable';

NONDIGIT: [a-zA-Z_];
DIGIT:  [0-9];

HEX_DIGIT : [0-9a-fA-F] ;

STRINGLITERAL
  : USTRINGLITERAL '"'
  ;

USTRINGLITERAL
  : '"' (~["\\\r\n] | '\\' (. | EOF))*
  ;


EXPONENT : 'e' | 'E';
