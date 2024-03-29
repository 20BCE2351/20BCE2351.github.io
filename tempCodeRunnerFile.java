code to create an integer array of size 5,
// using the Array class:

import java.lang.reflect.Array;
import java.util.Arrays;

public class GfG {
	public static void main(String[] args)
	{

		// Get the size of the array
		int sizeOfArray = 5;

		// Create an integer array
		// using reflect.Array class
		// This is done using the newInstance() method

		int[] intArray = (int[])Array.newInstance(
			int.class, sizeOfArray);
	
		// Printing the Array content
		System.out.println(Arrays.toString(intArray));
	}
}
