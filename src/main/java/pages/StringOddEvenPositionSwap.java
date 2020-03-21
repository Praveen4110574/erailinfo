package pages;

public class StringOddEvenPositionSwap {

	public static void main(String[] args) {
		String s="Welcome";
		char[] charArray = s.toCharArray();
		char temp;
		for (int i = 0; i <=charArray.length; i=i+2) {
			if(i+1<charArray.length) {
				temp=charArray[i];
				charArray[i]=charArray[i+1];
				charArray[i+1]=temp;
			}
		}

		for (char c : charArray) {
				System.out.print(c);
			
		}
	}

}
