// Define a grammar called Hello
grammar MyG;

program : 
		expression+
		;

expression : 
	
	'def' ID'(' ID ')' ':' expression 'end' #funCreation
	|ID '(' ID ')' #funCall
	|ID				# invocation
	|INT				 # int	
	| '(' expression ')' #paren
	|expression op=('*'|'/') expression #MulDiv // precidence! to poio strong poio pano
	|expression op=('+'|'-') expression  # AddSub     // match keyword hello followed by an identifier	
	|ID '=' expression #assignment
	;
	

ID : [a-z]+ ;
INT : [0-9]+ ;             // match lower-case identifiers
WS : [ \t\r\n]+ -> skip ; 
NEWLINE:'\r'? '\n' ;