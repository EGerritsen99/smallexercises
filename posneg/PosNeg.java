// TAGS boolean, if, int, methods, operators-logical, operators-relational, parameters, return

/* DESCRIPTION
https://codingbat.com/prob/p159227
Given 2 int values, return true if one is negative and one is positive.
Except if the parameter "negative" is true, then return true only if both are negative.

posNeg(1, -1, false) → true
posNeg(-1, 1, false) → true
posNeg(-4, -5, true) → true
 */


package posneg;

import java.util.Scanner;

public class PosNeg {

    public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
	    
		System.out.println("Enter a number.");
		int num1 = scanner.nextInt();
		 
		System.out.println("Enter another number.");
		int num2 = scanner.nextInt();
		
		System.out.println("Is 'negative' true or false?");
		boolean negative = scanner.nextBoolean();
		
		boolean returnMessage;
		
		if (num1 < 0 && num2 > 0 || num1 > 0 && num2 < 0) {
			
			returnMessage = true;
			
		} else if (num1 < 0 && num2 < 0 && negative == true) {
			
			returnMessage = true;
			
		} else {
			
			returnMessage = false;
			
		}
		
		System.out.println(returnMessage);
		
	}

}