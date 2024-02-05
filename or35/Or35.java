// TAGS methods, remainder-operator, operators-arithmetic, operators-logical, operators-relational, parameters, return

/* DESCRIPTION
https://codingbat.com/prob/p112564
Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator -- see Introduction to Mod

or35(3) → true
or35(10) → true
or35(8) → false
 */
package or35;

import java.util.Scanner;

public class Or35 {
	
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int number = getNumber();
		
		boolean isMultiple = isMultiple(number);
		
		System.out.println(isMultiple);
		
	}
	
	public static int getNumber() {
		
		System.out.println("Enter a number.");
		int newNumber = scanner.nextInt();
		
		while (newNumber < 0) {
			
			System.out.println("Please enter a number over 0.");
			newNumber = scanner.nextInt();
			
		}
		
		return newNumber;
		
	}
	
	public static boolean isMultiple(int number) {

		if ((number % 3 == 0) || (number % 5 == 0)) {
			
			return true;
			
		} else {
			
			return false;
			
		}
		
	}
	
}
