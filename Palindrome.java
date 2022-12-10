package Week1.Hw1;

public class Palindrome {

	public static void main(String[] args) {
		//Build a logic to find the given string is palindrome or not
	     
		/*
		 * Pseudo Code
		
		 * a) Declare A String value as"madam"
		 
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */
		String name = "Madam";
		String rev ="";
		char[] charArray = name.toCharArray();
		for (int j = charArray.length-1; j >=0 ; j--);
		{
			rev = rev + name;
		}
		if (name.toLowerCase().equals(rev.toLowerCase())) {
			System.out.println(name + " is a Palindrome String.");
		}
		else {
			System.out.println(name + " is not a Palindrome String.");
		}


	}
	}


