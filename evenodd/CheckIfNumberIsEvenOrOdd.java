/* DESCRIPTION
https://www.w3resource.com/java-exercises/basic/index.php
Write a Java program to accept a number and check the number is even or not. Prints 1 if the number is even or 0 if the number is odd.
Sample Output:

Input a number: 20
1
 */
 
 package evenodd;
 
 import java.util.Scanner;
 
 public class CheckIfNumberIsEvenOrOdd {
	 
	 public static Scanner scanner = new Scanner(System.in);
	 
	 public static void main(String[] args) {
		 
		 System.out.println("Enter a number.");
		 int number = scanner.nextInt();
		 
		 if (number % 2 == 0) {
			 
			 System.out.println("1");
			 
		 } else {
			 
			 System.out.println("0");
			 
		 }
		 
	 }
	 
 }
