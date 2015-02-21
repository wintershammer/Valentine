// Define a grammar called Hello
grammar MyG;

program : 
		expression+
		;

expression : 
	
	'def' ID'(' ID (',' ID)* ')' ':' expression 'end' #funCreation
	|'print' '(' ID ')' #printStatement
	|funCallFC #funCallFC1
	|ID				# reference
	|INT				 # int	
	| '(' expression ')' #paren
	|expression op=('*'|'/') expression #MulDiv // precidence! to poio strong poio pano
	|expression op=('+'|'-') expression  # AddSub     // match keyword hello followed by an identifier	
	|ID '=' expression #assignment
	;
	
funCallInt: 
	ID '(' INT (',' INT)* ')'
	;

funCall:
	ID '(' ID (',' ID)* ')'
	;

funCallFC:
	ID '(' ( funCall | funCallInt | ID | INT ) (',' funCall | ',' funCallInt | ',' INT | ',' ID)* ')'
	;

ID : [a-z]+ ;
INT : [0-9]+ ;             // match lower-case identifiers
WS : [ \t\r\n]+ -> skip ; 
NEWLINE:'\r'? '\n' ;