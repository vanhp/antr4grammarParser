package expression;

public class Variable extends Expression {
	public String id;
	
	public Variable(String idx) {
		id = idx;

	}
	@Override
	public String toString() {
		return id;
	}
}
