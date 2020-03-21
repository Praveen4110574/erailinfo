package pages;

public class WordsCountEachwordCharacterCountInString {

	public static void main(String[] args) {
		String s="My name is Praveen";
		String[] words = s.split(" ");
		int wordsCount = words.length;
		System.out.println("No. of words in the given string: "+wordsCount);
		
		for (int i = 0; i < wordsCount; i++) {
			char[] characters = words[i].toCharArray();
			int eachWordCharacterCount = characters.length;
			System.out.println("No. of characters in the word "+words[i]+" is : "+eachWordCharacterCount);
		}

	}

}
