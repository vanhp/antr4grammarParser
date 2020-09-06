grammar Expr;
/* grammar name and file name must match*/

@header {

	package antlr;
	import org.antlr.v4.runtime.*;
	import java.io.*;
	import java.util.*;
		
	//mode classes
	import expression;
}

// attributes or methods for the generated parser class
@members{
	//for error handling
	public List<String> vars = new ArrayList<>();
	public List<String> semanticErrors = new ArrayList<>();
	
	// root of AST (of type Expression)
	public Program program;
}

// start variable
prog returns [Program p]
@init{ // will be executed first before production take effect
	$p = new Program();
	program = $p;
}
	: 
		(
			x=decl {
				$p.addExpression($x.d);
			}
			| 
			y=expr {
				$p.addExpression($y.e);
			}
		)+ 
		EOF
	;
	
decl returns [Expression d]
	: name=ID ':' type=INT_TYPE '=' val=NUM{
		int line = $name.getLine();
		int column = $name.getCharPositionInLine() + 1;
		
		String id = $name.text;
		if(vars.contains(id)){
			semanticErrors.add("Error: variable " + id + " already declared (" + line + ", " + column + ")");
		}
		else {vars.add(id);}
		
		// handling type
		String type = $type.getText(); 
		
		// handling val
		int val = $val.int;
		
		// create declaration object
		$d = new VariableDeclaration(id,type,val);
	}
	;
	
// 1st higher precedence	
// 2nd lower precendence
expr returns [Expression e]
	: left=expr '*' right=expr{
		$e = new Multiplication($left.e,$right.e);
	} 
	| left=expr '+' right=expr{
		$e = new Addition($left.e,$right.e);
	}  
	| id=ID{
		int line = $id.getLine();
		int column = $id.getCharPositionInLine() + 1;
		if(!vars.contains($id.text)){
			semanticErrors.add("Error: variable " + $id.text + "not declared (" + line + ", " + column + ")");
		}
		$e = new Variable($id.text);
	}
	| n=NUM {// while building the subtree of an expr node that contains NUM as the first child,
		   // we also build Expression object.
			$e = new expression.Number($n.int)
	}
	;
	
	/* token*/
ID : [a-z][a-zA-Z0-9_]*;  // for identifier
NUM : '0' | '-'?[1-9][0-9]*;
INT_TYPE : 'INT';
COMMENT : '--' ~[\r\n]* -> skip;  //ignore
WS : [ \t\n]+ -> skip;            //ignore
