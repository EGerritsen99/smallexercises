package reverse_integer;

// TAGS operators-arithmetic, operators-relational, Scanner, Scanner.nextInt(), System.out.print(), while-loops

/* DESCRIPTION
Write a program that displays a given integer in the reverse order.
Example:
Enter an integer: 4235
5324
 */
 
import java.util.Scanner;

public class ReverseAnInteger {
	
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter a number.");
		String input = scanner.nextLine();

		StringBuilder stringbuilder = new StringBuilder(input);
		
		System.out.println(stringbuilder.reverse());
		
	}
	
}