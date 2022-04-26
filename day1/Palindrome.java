package week2.day1;

////Build a logic to find the given string is palindrome or not
//
//	/*
//	 * Pseudo Code
//	
//	 * a) Declare A String value as"madam"
//	 
//	 * b) Declare another String rev value as ""
//	 * c) Iterate over the String in reverse order
//	 * d) Add the char into rev
//	 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
//	 
//	 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
//	 */
public class Palindrome {

	public static void main(String[] args) {
		
    String str = "madam";
    String revstr = "";

// Add the char into rev
    
    char[] ca= str.toCharArray();
    		
//Iterate over the String in reverse order

    int size = ca.length;
    
	for (int i=size-1; i>=0; i--)
    {
	revstr = revstr + ca[i]; // Add the char into rev
	
    }
    
 // Compare the original String with the reversed String, if it is same then
 		// print palinDrome
	
    if (str.equals(revstr)){
    System.out.println(str+ " is a polindrome"); 
    }
    else
    {
    System.out.println(str+ " is not a polindrome");
    }
	}

}
