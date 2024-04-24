grammar CLang;

program       : method* main;

statement     : (declaration | definition | print | method_call) ';'
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
              | method_call 
              | arit_operation 
              ;
arit_operation: arit_operation '+'  arit_operation              
              | arit_operation '-' arit_operation               
              | arit_operation '^' arit_operation               
              | arit_operation '/' arit_operation               
              | arit_operation '*' arit_operation               
              | var_expr                                        
              | 'sqrt' '(' arit_operation ')'                   
              ;
method_call : tk_id '(' var_value (',' var_value)* ')'          
              | tk_id '(' ')'                                   
              ;
bool_operation: bool_operation 'AND' bool_operation             
              | bool_operation 'OR' bool_operation              
              | bool_operation 'NOT' bool_operation             
              | FALSE                                           
              | TRUE                                            
              | bool_compare                                    
              ;
bool_compare  : var_expr '==' var_expr                          
              | var_expr '!=' var_expr                          
              | var_expr '>=' var_expr                          
              | var_expr '<=' var_expr                          
              | var_expr '>' var_expr                           
              | var_expr '<' var_expr                           
              | '(' bool_compare ')'                            
              ;
var_expr      : tk_id                                           
              | tk_int                                          
              | tk_float                                        
              | tk_string                                       
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
