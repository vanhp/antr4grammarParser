package app;

import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
//import org.antlr.v4.runtime.tree.ParseTree;

import antlr.ExprLexer;
import antlr.ExprParser;

import expression.ExpressionProcessor;
import expression.Program;
import expression.SyntaxErrorListener;

public class ExressionApp {
	public static void main(String [] args) {
		if(args.length != 1) {
			System.err.print("usage: file name\n");
		}else {
			String fileName = args[0];
			ExprParser parser = getParser(fileName);
			
			/*
			 * tell Antlr to build the AST
			 * then parse it from the top where prog symbol start
			 * */
	//		ParseTree antlrAST = parser.prog();
			parser.prog();
			
			if(!SyntaxErrorListener.hasError) {
			
				/* create visitor for converting the parse tree 
				 * into Program/Expression object
				 * 
				 * */
//				AntlrToProgram progVisitor = new AntlrToProgram();
//				Program prog = progVisitor.visit(antlrAST);
				Program prog = parser.program;
				
				if(parser.semanticErrors.isEmpty()) {
					ExpressionProcessor ep = new ExpressionProcessor(prog.expressions);
					for(String evaluation: ep.getEvaluationResults()) {
						System.out.println(evaluation);
					}
				}else {
					for(String err: parser.semanticErrors) {
						System.out.println(err);
					}
				}
			}
		}
	}
	
	/*
	 * the type of parser and lexer are specific to the grammar name in the 
	 * Expr.g4
	 * */
	private static ExprParser getParser(String fileName) {
		ExprParser parser = null ;
		
		try {
				CharStream input = CharStreams.fromFileName(fileName);
				ExprLexer lexer = new ExprLexer(input);
				CommonTokenStream tokens = new CommonTokenStream(lexer);
				parser = new ExprParser(tokens);
				
				// handling syntax error
				parser.removeErrorListeners();
				parser.addErrorListener(new SyntaxErrorListener());
							
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		return parser;
	}
}
