/* DESCRIPTION
https://codingbat.com/prob/p183592
Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki". 
If the string length is less than 2, use whatever chars are there.

front22("kitten") → "kikittenki"
front22("Ha") → "HaHaHa"
front22("abc") → "ababcab"
 */
 
 package front_22;
 
 import java.util.Scanner;
 
 public class Front22 {
	 
	 public static Scanner scanner = new Scanner(System.in);
			 
	 public static void main(String[] args) {
		 
         StringBuilder newString = new StringBuilder();
		 
		 System.out.println("Enter something.");
		 String input = scanner.next();
		 
		 char[] inputArray = input.toCharArray();
		 
		 // Get characters to add
		 char firstChar = inputArray[0];
		 char secondChar;
		 
		 if (inputArray.length > 1) {
			 
			secondChar = inputArray[1]; 
			
		 } else {
			 
			secondChar = inputArray[0];
			 
		 }

		 // Make new string
		 newString.append(firstChar);
		 newString.append(secondChar);
		 
		 for (int i = 0; i < inputArray.length; i++) {
			
			 char character = inputArray[i];
			 newString.append(character);
			 
		 }
		 
		 newString.append(firstChar);
		 newString.append(secondChar);
		 
		 System.out.println(newString);
		 
		 
	 }
	 
 }