package Week1.Hw1;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		/*
		 Pseudo Code
		 
		 * Declare String Input as Follow
		  
		 * String test = "changeme";
		 
		 * a) Convert the String to character array
		 
		 * b) Traverse through each character (using loop)
		 
		 * c)find the odd index within the loop (use mod operator)
		 
		 * d)within the loop, change the character to uppercase, if the index is odd else don't change
		  
		 */
		
		String name = "changeme";
		String[] words = name.split(" ");
		char[] charArray = name.toCharArray();
		for (int j = 0; j < charArray.length; j++)
		{			
			char ch=name.charAt(j);
			if(j % 2 == 0) 
				ch=Character.toUpperCase(ch);
			name=name+ch;
		}
		System.out.println(""+name);


	}

}
