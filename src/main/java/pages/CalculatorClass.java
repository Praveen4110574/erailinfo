package pages;

public class CalculatorClass implements CalculatorInterface{

	@Override
	public void add(int a, int c) {
		System.out.println("Addition : "+(a+b));
		
	}

	@Override
	public void sub(int a, int b) {
System.out.println("Subtraction : "+(b-a));		
	}

	@Override
	public void mul(int a, int b) {
System.out.println("Multiplication : "+(a*b));		
	}

	@Override
	public void div(int a, int b) {
System.out.println("Division : "+(b/a));		
	}
public static void main(String[] args) {
	CalculatorInterface cal=new CalculatorClass();
	cal.add(a, b);
	cal.sub(a, b);
	cal.mul(a, b);
	cal.div(a, b);
}
}
