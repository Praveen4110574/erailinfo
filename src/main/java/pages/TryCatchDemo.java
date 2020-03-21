package pages;

public class TryCatchDemo {
int a=25,b=30;
	public void divideByZero(){
		try {
	    int c=a/0;	
	    System.out.println(c);
	    throw new Exception("arithmetic exception");
	}
		
	catch(Exception e){
		System.out.println("Cannot divide by zero");
		String message = e.getMessage();
		System.out.println(message);
		
	}
	System.out.println(a+b);
	System.out.println(b-a);
	}
	
	public static void main(String[] args) throws Exception {
		TryCatchDemo demo=new TryCatchDemo();
		demo.divideByZero();
	}
	}

