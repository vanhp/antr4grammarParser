package expression;

import java.util.ArrayList;
import java.util.List;

import antlr.ExprBaseVisitor;
import antlr.ExprParser.ProgaramContext;

public class AntlrToProgram extends ExprBaseVisitor<Program>{
	// this is the root node of the AST
	
	/*
	 * store semantic error in the codes
	 * 1. declare more than once
	 * 2. refer to undeclared variable
	 * */
	public List<String> semanticErrors;
	
	
	@Override
	public Program visitProgaram(ProgaramContext ctx) {
		Program prog = new Program();
		semanticErrors = new ArrayList<>();
		
		// get the node visitor to traverse the node
		AntlrToExpression exprVisitor = new AntlrToExpression(semanticErrors);
		for(int i = 0;i < ctx.getChildCount();i++) {
			if(i == ctx.getChildCount() -1) {
				// skip this EOF node it's the last child of the root node
			}
			else {
				prog.addExpression(exprVisitor.visit(ctx.getChild(i)));
			}
		}
		return prog;
	}

}
