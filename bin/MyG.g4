grammar MyG;

program : 
		expression+ #plain
		;

expression : 
	'(' expression ')' #paren
	|'if' expression (boolOper expression)* '{' consequent '}' ('else' '{' alternative '}')? #ifStatement
	|'read' '(' ID ')' #inputStatement
	|'delay' '(' expression+ ')' #delayStatement
	|'list' '(' (expression (',' expression)*)* ')' #listCreation
	|'dict' '(' STRING ',' expression (',' STRING ',' expression)* ')' #mapCreation //could call it map instead of dict but contradicts map function
	|'apply' '(' expression (',' expression)* ')' #apply //first expression should be a function, second one a list or some argument to be appended to the list
	|ID '.' 'add' '(' STRING ',' expression (',' STRING ',' expression)* ')' #mapAdd
	|ID '.' 'remove' '(' STRING (',' STRING)* ')' #mapRemove
	|ID '.' 'get' '(' STRING (',' STRING)* ')' #mapGet
	|headSt #head
	|'append' '(' expression (',' expression)* ')' #append //first ID is the list to append to
	|'prepend' '(' expression (',' expression)* ')' #prepend //first ID is list to prepend to
	|tailSt #tail
	|'print' '(' expression (',' expression)* ')' #printStatement
	|'null?' '(' expression ')' #nullCheck
	|'list?' '(' expression ')' #listCheck
	|'load' FILENAME (ID (',' ID)*) #loadStatement
	|anonCall #anonCall1
	|funCallFC #funCallFC1
	|anonCreation #anonCreation1
	|funCreation #funCreation1
	|expression relOper expression #boolExpress
	|'not' expression #boolNeg
	|expression boolOper expression #boolCheck
	|expression op=('*'|'/') expression #MulDiv // precidence! to poio strong poio pano
	|expression op=('+'|'-') expression  # AddSub     // match keyword hello followed by an identifier	
	|ID '=' expression #assignment
	|ID				# reference
	|INT				 # int	
	|BOOLEAN 			 #bool
	|STRING #string // ~ is negation : everything but \r \n or "

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
	'lambda' '(' (ID (',' ID)*)* ')' '{' expression+ '}' 
	;
	

funCallFC:
	ID '(' ( expression (',' expression)* )*  ')'
	;

funCreation:
	'def' ID'(' ( variadicID | ID (',' ID)* (',' variadicID)? )* ')' '{' expression+ '}' 
	//arguments can be: a single variadic ID or one or more regular IDs followed by a zero or one variadic id(? = zero or one) 
	//for example: valid arguments are: () none, (x) single ID, (&x) single vararg, (x,&x),(x,y,&x) etc
	//again : one or more arguments are optional.
	;
	
variadicID:
	'&' ID
	;

COMMENT:  '#' ~( '\r' | '\n' )* -> skip;
FILENAME:  '::' ~( '\r' | '\n')* '::';
STRING: '"' ~('\r' | '\n' | '"')* '"';
BOOLEAN: ('true' | 'false');
ID : ([a-z] | [A-Z])+ ;
INT : [0-9]+ ;             // match lower-case identifiers
WS : [ \t\r\n]+ -> skip ; 
NEWLINE:'\r'? '\n' ;