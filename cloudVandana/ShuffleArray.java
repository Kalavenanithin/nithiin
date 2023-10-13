package assignment;

import java.util.Random;

public class ShuffleArray {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7};
		//creating a random object 
		Random random = new Random();
		//iterate over the array and swap each element with a random element in the array
		for (int i = 0; i < array.length; i++) {
			int randomindex = random.nextInt(array.length);
			int temp = array[i];
			array[i]=array[randomindex];
			array[randomindex]=temp;
		}
		//print the shuffled array
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}		
	}
}
