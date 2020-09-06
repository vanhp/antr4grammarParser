package expression;

public class VariableDeclaration extends Expression {
	public String id;
	public String type;
	public int value;
	
	public VariableDeclaration(String idx,String t,int val) {
		id = idx;
		type = t;
		value = val;
				
	}
}
