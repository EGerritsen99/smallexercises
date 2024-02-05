/* DESCRIPTION
https://codingbat.com/prob/p177372
Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.

max1020(11, 19) → 19
max1020(19, 11) → 19
max1020(11, 9) → 11
 */
 
 package max_1020;
 
 import java.util.Scanner;
 
 public class Max1020 {
	 
	 public static Scanner scanner = new Scanner(System.in);
	 
	 public static void main(String[] args) {
		 
		 System.out.println("Enter a number.");
		 int num1 = scanner.nextInt();
		 
		 System.out.println("Enter another number.");
		 int num2 = scanner.nextInt();
		 
		 if (num1 > num2 && num1 > 10 && num1 < 20) {
			 
			 System.out.println(num1);
			 
		 } else if (num2 > 10 && num2 < 20) {
			 
			 System.out.println(num2);
			 
		 } else {
			 
			 System.out.println("No valid numbers entered");
			 
		 }
		 
	 }
	 
 }