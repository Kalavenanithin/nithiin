package assignment;

import java.util.HashMap;
import java.util.Map;

public class RomanNumber {
	
		private static final Map<Character, Integer> romanNumeralMap = new HashMap<>();
		static {
			romanNumeralMap.put('I', 1);
			romanNumeralMap.put('V', 5);
			romanNumeralMap.put('X', 10);
			romanNumeralMap.put('L', 50);
			romanNumeralMap.put('C', 100);
			romanNumeralMap.put('D', 500);
			romanNumeralMap.put('M', 1000);			
		}
		public static int romanToInteger(String romanNumeral) {
			int runningTotal=0;
			int previousValue=0;
			for (int i = 0; i < romanNumeral.length(); i++) {
				int currentValue = romanNumeralMap.get(romanNumeral.charAt(i));
				if (currentValue>previousValue) {
					runningTotal-=previousValue;
				}
				runningTotal+=currentValue;
				previousValue=currentValue;
			}
			return runningTotal;
		}
		public static void main(String[] args) {
			String romanNumeral="III";
			int integervalue = romanToInteger(romanNumeral);
			System.out.println(integervalue);			
		}
	
}
