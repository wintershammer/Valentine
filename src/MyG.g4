grammar MyG;

program : 
		expression+
		;

expression : 
	
	'def' ID'(' ID (',' ID)* ')' ':' expression+ 'end' #funCreation
	|anonCall #anonCall1
	|anonCreation #anonCreation1
	|'print' '(' ID ')' #printStatement
	|funCallFC #funCallFC1
	|'list' '(' argument (',' argument)* ')' #listCreation
	|ID				# reference
	|INT				 # int	
	| '(' expression ')' #paren
	|expression op=('*'|'/') expression #MulDiv // precidence! to poio strong poio pano
	|expression op=('+'|'-') expression  # AddSub     // match keyword hello followed by an identifier	
	|ID '=' expression #assignment
	;


anonCall:
	anonCreation '(' argument (',' argument)* ')'
	;

argument:
	funCallFC | anonCreation | anonCall | funCall | funCallInt | ID | INT
	;

anonCreation:	
	'lambda' '(' ID (',' ID)* ')' ':' expression+ 'end' 
	;
	
funCallInt: 
	ID '(' INT (',' INT)* ')'
	;

funCall:
	ID '(' ID (',' ID)* ')'
	;

funCallFC:
	ID '(' argument (',' argument)* ')'
	;


COMMENT:  '#' ~( '\r' | '\n' )* -> skip;
ID : [a-z]+ ;
INT : [0-9]+ ;             // match lower-case identifiers
WS : [ \t\r\n]+ -> skip ; 
NEWLINE:'\r'? '\n' ;