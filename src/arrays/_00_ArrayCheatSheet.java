package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings

		// String[] five = new String[5];
		Random rand = new Random();
		int a = rand.nextInt(47);
		// 2. print the third element in the array
		// System.out.println(five[3]);
		// 3. set the third element to a different value
		// five[3] = "3";
		// 4. print the third element again
		// System.out.println(five[3]);
		// 5. use a for loop to print all the values in the array
		// for (int i = 0; i < five.length; i++) {
		// System.out.println(five[i]);
		// }
		// BE SURE TO USE THE ARRAY'S length VARIABLE

		// 6. make an array of 50 integers
		int[] fifty = new int[50];
		int big = fifty[0];
		// 7. use a forloop to make every value of the integer array a random number
		for (int i = 0; i < fifty.length; i++) {
			fifty[i] = rand.nextInt(50);
		}
		// 8. without printing the entire array, print only the smallest number in the
		// array
		for (int i = 0; i < fifty.length; i++) {
			if (big < fifty[i]) {
				big = fifty[i];
				
			}
		
		}
		System.out.println(big);
		// 9 print the entire array to see if step 8 was correct

		// 10. print the largest number in the array.
	}
}
