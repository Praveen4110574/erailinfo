package pages;

public class ChildClass extends ParentClass {
	

	
	public ChildClass(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	void print() {
		System.out.println(super.a+super.b);
	}

	public static void main(String[] args) {
		
		ChildClass child=new ChildClass(20,30);
		child.print();
		
	}
}
