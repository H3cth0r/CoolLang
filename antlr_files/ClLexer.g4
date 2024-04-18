lexer grammar ClLexer;

WS : [ \t\r\n]+ -> skip ;

MAIN: 'main';

IF:     'if';
ELIF:   'elif';
ELSE:   'else';

WHILE:  'while';
FOR:    'for';

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

INT:    'int';
FLOAT:  'float';
STRING: 'string';
BOOL:   'bool';

TRUE:   'true';
FALSE:  'false';

EQEQUAL:'==';
NOTEQUAL:'!=';

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
