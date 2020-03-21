package MultipleInheritence;

public class ImplementingClass implements Interface1,Interface2 {
	
	public void print() {
		System.out.println("hello");
		
	}


	public static void main(String[] args) {
		
ImplementingClass im=new ImplementingClass();
im.print();
	}

	
	
}
