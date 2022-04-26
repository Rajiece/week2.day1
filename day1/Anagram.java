package week2.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";

		// check if length is same
		if (text1.length() == text2.length()) {

	    // convert strings to char array
	    char[] charArray1 = text1.toCharArray();
	    char[] charArray2 = text2.toCharArray();

	    // sort the char array
	    Arrays.sort(charArray1);
	    Arrays.sort(charArray2);
	    
	    boolean result = Arrays.equals(charArray1, charArray2); // if sorted char arrays are same

		if (result) {
			System.out.println(text1 + " and " + text2 + " are anagram.");// then the string is anagram
		} 
		
		else 
			
		{
			System.out.println(text1 + " and " + text2 + " are not anagram.");
	
	    }
		}
	    }
        }
        
