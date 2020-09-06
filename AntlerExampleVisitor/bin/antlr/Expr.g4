grammar Expr;
/* grammar name and file name must match*/

@header {
	package antlr;
}

// start variable
prog: (decl | expr)+ EOF	# Progaram
	;
	
decl: ID ':' INT_TYPE '=' NUM  # declaration
	;
	
// 1st higher precedence	
// 2nd lower precendence
expr: expr '*' expr    			# multiplication
	| expr '+' expr  			# addition
	| ID						# variable
	| NUM						# number
	;
	
	/* token*/
ID : [a-z][a-zA-Z0-9_]*;  // for identifier
NUM : '0' | '-'?[1-9][0-9]*;
INT_TYPE : 'INT';
COMMENT : '--' ~[\r\n]* -> skip;  //ignore
WS : [ \t\n]+ -> skip;            //ignore
