package expression;

public class Number extends Expression {

	int num;
	
	public Number(int n ) {
		num = n;
	}
	
	
	@Override
	public String toString() {
		return new Integer(num).toString();
	}
	
}
