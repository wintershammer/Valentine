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
	|expression op=('*'|'/') expression #MulDiv // precedence! stronger binding -> higher in the list
	|expression op=('+'|'-') expression  # AddSub 	
	|ID '=' expression #assignment
	;
	

ID : [a-z]+ ;
INT : [0-9]+ ;             
WS : [ \t\r\n]+ -> skip ; 
NEWLINE:'\r'? '\n' ;