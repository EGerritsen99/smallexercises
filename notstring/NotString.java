package notstring;


// TAGS methods, operators-logical, operators-relational, parameters, return, String, String.equals(), String.length(), 
// String.startsWith, String.substring, String-concatenation,

/* DESCRIPTION
https://codingbat.com/prob/p191914
Given a string, return a new string where "not " has been added to the front. However, 
if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.

notString("candy") → "not candy"
notString("x") → "not x"
notString("not bad") → "not bad"
 */
 
 import java.util.Scanner;
 
public class NotString {
	
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter a phrase or word.");
		String input = scanner.nextLine();
		
		String output = getOutput(input);
		
		System.out.println(output);
		
	}
	
	public static String getOutput(String input) {
		
		String not = "Not ";
		
		if (input.startsWith("Not") || input.startsWith("not")) {
			
			return input;
			
		} else {
			
			String newString = not + input;
			
			return newString;
			
		}
		
	}
	
}