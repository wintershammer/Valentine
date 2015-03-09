grammar MyG;

program : 
		expression+ #plain
		;

expression : 
	'(' expression ')' #paren
	|funCreation #funCreation1
	|'if' expression (boolOper expression)* ':' consequent 'end' ('else' ':' alternative 'end')? #ifStatement
	|anonCall #anonCall1
	|anonCreation #anonCreation1
	|funCallFC #funCallFC1
	|'delay' '(' expression+ ')' #delayStatement
	|'list' '(' (expression (',' expression)*)* ')' #listCreation
	|headSt #head
	|'append' '(' expression (',' expression)* ')' #append //first ID is the list to append to
	|tailSt #tail
	|'print' '(' expression ')' #printStatement
	|'null?' '(' expression ')' #nullCheck
	|'list?' '(' expression ')' #listCheck
	|'load' FILENAME (ID (',' ID)*) #loadStatement
	|expression relOper expression #boolExpress
	|expression boolOper expression #boolCheck
	|expression op=('*'|'/') expression #MulDiv // precidence! to poio strong poio pano
	|expression op=('+'|'-') expression  # AddSub     // match keyword hello followed by an identifier	
	|ID '=' expression #assignment
	|ID				# reference
	|INT				 # int	
	|BOOLEAN 			 #bool
	|'"' ~('\r' | '\n' | '"')* '"' #string // ~ is negation : everything but \r \n or "

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
	anonCreation '(' (expression (',' expression)* ) * ')' 
	// ( argument (',' argument)* )* : optional(one argument, optional (more args seperated by commas)) 
	// arguments are of course optional because a function has the option to take no arguments
	;
	
headSt:
	'first' '(' expression ')' ;

tailSt:
	 'rest' '(' expression ')' ;


anonCreation:	
	'lambda' '(' (ID (',' ID)*)* ')' ':' expression+ 'end' 
	;
	

funCallFC:
	ID '(' ( expression (',' expression)* )*  ')'
	;

funCreation:
	'def' ID'(' ( ID (',' ID)* )* ')' ':' expression+ 'end' //again : one or more arguments are optional.
	;

COMMENT:  '#' ~( '\r' | '\n' )* -> skip;
FILENAME:  '::' ~( '\r' | '\n')* '::';
BOOLEAN: ('true' | 'false');
ID : ([a-z] | [A-Z])+ ;
INT : [0-9]+ ;             // match lower-case identifiers
WS : [ \t\r\n]+ -> skip ; 
NEWLINE:'\r'? '\n' ;