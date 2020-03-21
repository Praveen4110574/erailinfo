package pages;

public class Squareroot {
	
	public static void squareRoot(int num) {
		//for (int i = 0; i <=num/2; i++) {
			int i=1,result=1;
			while(result<=num) {
				i++;
				result=i*i;
				System.out.println("square root of "+num+" is : "+i );
				
			}
			
		//}
		

	}

	public static void main(String[] args) {
		
		Squareroot.squareRoot(529);
	}

}
