package pages;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class AddZerosInEnd {

	public static void main(String[] args) {
		List<Integer> inputList=new LinkedList<>(Arrays.asList(1,0,5,9,0,0,6,8,2,0,0,0,8,0,9));
		Collections.sort(inputList);
		System.out.println(inputList);
		Collections.reverse(inputList);
		System.out.println(inputList);
		System.out.println("Input : "+inputList);
		List<Integer> output=new LinkedList<>();
		
		int size = inputList.size();
		
		for (int i = 0; i <= size-1; i++) {
			if(inputList.get(i)!=0) {
				output.add(inputList.get(i));
			}
		}
		
		for (int i = size-1; i >=0; i--) {
			if(inputList.get(i)==0) {
				output.add(inputList.get(i));
			}
		}

System.out.println("Output : "+output);
	}

}
