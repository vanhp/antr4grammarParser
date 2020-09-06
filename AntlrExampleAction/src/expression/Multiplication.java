package expression;

public class Multiplication extends Expression {
	
	public Expression left;
	public Expression right;
	
	public Multiplication(Expression l,Expression r) {
		left = l;
		right = r;
	}
	
	@Override
	public String toString() {
		return left.toString() + " * " + right.toString();
	}
}
