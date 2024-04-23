grammar CLang;

program       : method* main;

statement     : (declaration | definition | print | call_function) ';'
              ;
print         : 'print' '(' arit_operation ')'
              ;
declaration   : type tk_id
              ;
definition    : declaration '=' var_value 
              | tk_id '=' var_value
              ;
var_value     : tk_int
              | tk_string
              | tk_float
              | call_function
              | arit_operation 
              ;
arit_operation: arit_operation '+'  arit_operation              # sum
              | arit_operation '-' arit_operation               # substract
              | arit_operation '^' arit_operation               # power
              | arit_operation '/' arit_operation               # div
              | arit_operation '*' arit_operation               # mul 
              | var_expr                                        # var
              | 'sqrt' '(' arit_operation ')'                   # sqrt
              ;
call_function : tk_id '(' var_value (',' var_value)* ')'        # params
              | tk_id '(' ')'                                   # no_params
              ;
bool_operation: bool_operation 'AND' bool_operation             # AND
              | bool_operation 'OR' bool_operation              # OR
              | bool_operation 'NOT' bool_operation             # NOT
              | FALSE                                           # False
              | TRUE                                            # True
              | bool_compare                                    # bool_compare_op
              ;
bool_compare  : var_expr '==' var_expr                          # equal_to
              | var_expr '!=' var_expr                          # not_equal_to
              | var_expr '>=' var_expr                          # greater_than_or_equal_to
              | var_expr '<=' var_expr                          # less_than_or_equal_to
              | var_expr '>' var_expr                           # greater_than
              | var_expr '<' var_expr                           # less_than
              | '(' bool_compare ')'                            # enclosed_bool_compare 
              ;
var_expr      : tk_id                                           # var_name
              | tk_int                                          # integer_expr
              | tk_float                                        # float_expr
              | tk_string                                       # string_expr
              ;

body_statements : statement
                | if
                | for
                | while
                ;
// Method statements
method        : method_def method_body
              ;
method_def    : method_type tk_id '(' declaration ( ',' declaration)* ')'
              | method_type tk_id '()'
              ;
method_body   : '{' body_statements* '}'
              | '{' body_statements* method_return '}'
              ;
method_type   : VOID
              | type
              ;
method_return : 'return' var_expr ';'
              ;
// If statements
if            :  if_def else_if_def* | if_def  else_if_def* else_def
              ;
if_def        : 'if' '(' bool_operation ')' '{' body_statements+ '}'
              ;
else_if_def   : 'else-if' '(' bool_operation ')' '{' body_statements+ '}';
else_def      : 'else' '{' body_statements+ '}'
              ;
// for statement
for           : for_def for_body
              ;
for_def       : 'for' '(' definition ';' bool_operation ';' definition ')'
              ;
for_body      : '{' body_statements+ '}'
              ;
// while statement
while         : while_def while_body
              ;
while_def     : 'while' '(' bool_operation ')'
              ;
while_body    : '{' body_statements+ '}'
              ;
type          : INT
              | FLOAT
              | STRING 
              ;
// main statement
main          : 'main' '{' body_statements+ '}'
              ;

tk_id: ID;
tk_int: DECIMAL* NUMBER+;
tk_float: DECIMAL* NUMBER+ POINT NUMBER+;
tk_string: STR;

tk_add: ADD;
tk_substract: SUBSTRACT;
tk_multiply: MULTIPLY;


// Lexer
WS: [ \t\r\n]+ -> skip;

POINT:  '.';
COLON:  ':';

INT:    'int';
FLOAT:  'float';
STRING: 'string';
VOID:   'void';

TRUE:   'True';
FALSE:  'False';

ADD:        '+';
SUBSTRACT:  '-';
MULTIPLY:   '*';
EQUAL:      '=';
POW:        '^';
DIV:        '/';

ID:       [a-zA-Z][a-zA-Z0-9_]*;
NUMBER:   [0-9];
DECIMAL:  [1-9];
STR:   ['][a-zA-Z0-9,. ]* ['];
