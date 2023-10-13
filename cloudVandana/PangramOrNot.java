package assignment;

import java.util.HashSet;
import java.util.Set;

public class PangramOrNot {
	public static boolean isPangram(String input) {
		input = input.toLowerCase();
		Set <Character> uniqueCharacters = new HashSet<>();
		for (int i = 0; i < input.length(); i++) {
			uniqueCharacters.add(input.charAt(i));
		}
		return uniqueCharacters.size()==26;
	}
	public static void main(String[] args) {
		String input1 = "theQuickBrownFoxJumpsOverTheLazyDog";
		String input2 = "nithin";
		
		boolean isPangram1 = isPangram(input1);
		boolean isPangram2 = isPangram(input2);
		
		if (isPangram1) {
			System.out.println("The Given String is pangram");
		}
		else {
			System.err.println("The Given String is Not pangram");
		}
		if (isPangram2) {
			System.out.println("The Given String is pangram");
		}
		else {
			System.err.println("The Given String is Not pangram");
		}
	}
}
