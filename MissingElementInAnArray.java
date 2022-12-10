package Week1.Hw1;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub// Here is the input
		//int[] arr = {1,2,3,4,7,6,8};

		// Sort the array	
		

		// loop through the array (start i from arr[0] till the length of the array)

			// check if the iterator variable is not equal to the array values respectively
			
				// print the number
				
				// once printed break the iteration
		
		int[] arr = {1,2,3,4,7,6,8};
		int n=arr.length;
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != i+1)
			{

				System.out.println(arr[i]);
				break;
			}


		}

	}
}


				
