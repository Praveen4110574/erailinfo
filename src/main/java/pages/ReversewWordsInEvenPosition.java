package pages;

import java.util.Arrays;

public class ReversewWordsInEvenPosition {

	public static void main(String[] args) {
String input="pots tops abcd bdca abcd tops balla allab";
String[] words = input.split(" ");
for (int i = 0; i < words.length; i++) {
	for (int j = 1; j < words.length; j++) {
		if(words[i].equals(words[j])) {
			continue;
		}
		else
		{
			char[] charArray2 = words[i].toCharArray();
			char[] charArray = words[j].toCharArray();
			Arrays.sort(charArray2);
			Arrays.sort(charArray);
			String str=new String(charArray2);
			String str1=new String(charArray);
			if(str1.equals(str)) {
				System.out.println(words[i]+ " and "+words[j]+" form a anagram");
				words[i]="";
				words[j]="";
				
			}
			
		}
	}
}
}
}
