grammar MyG;

program : 
		expression+ #plain
		;

expression : 
	
	'def' ID'(' ID (',' ID)* ')' ':' expression+ 'end' #funCreation
	|'if' ID ':' consequent 'end' ('else' ':' alternative 'end')? #ifStatement
	|anonCall #anonCall1
	|anonCreation #anonCreation1
	|funCallFC #funCallFC1
	|'list' '(' argument (',' argument)* ')' #listCreation
	|'print' '(' ID ')' #printStatement
	|ID				# reference
	|INT				 # int	
	|BOOLEAN 			 #bool
	| '(' expression ')' #paren
	|expression boolOper expression #boolExpress
	|expression op=('*'|'/') expression #MulDiv // precidence! to poio strong poio pano
	|expression op=('+'|'-') expression  # AddSub     // match keyword hello followed by an identifier	
	|ID '=' expression #assignment
	;


consequent:
	expression+
	;

alternative:
	expression+
	;

boolExpress1:
	expression boolOper expression
	;

boolOper:
	('>' | '<' | '>=' | '<=' | '==' | '!=')
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
BOOLEAN: ('true' | 'false');
ID : [a-z]+ ;
INT : [0-9]+ ;             // match lower-case identifiers
WS : [ \t\r\n]+ -> skip ; 
NEWLINE:'\r'? '\n' ;