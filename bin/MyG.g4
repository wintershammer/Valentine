grammar MyG;

program : 
		expression+ #plain
		;

expression : 
	'(' expression ')' #paren
	|'def' ID'(' ID (',' ID)* ')' ':' expression+ 'end' #funCreation
	|'if' expression (boolOper expression)* ':' consequent 'end' ('else' ':' alternative 'end')? #ifStatement
	|anonCall #anonCall1
	|anonCreation #anonCreation1
	|funCallFC #funCallFC1
	|'list' '(' argument (',' argument)* ')' #listCreation
	|'print' '(' ID ')' #printStatement
	|expression relOper expression #boolExpress
	|expression boolOper expression #boolCheck
	|expression op=('*'|'/') expression #MulDiv // precidence! to poio strong poio pano
	|expression op=('+'|'-') expression  # AddSub     // match keyword hello followed by an identifier	
	|ID '=' expression #assignment
	|ID				# reference
	|INT				 # int	
	|BOOLEAN 			 #bool

	;


consequent:
	expression+
	;

alternative:
	expression+
	;


boolOper:
	'and' | 'or'
	;
	

relOper:
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