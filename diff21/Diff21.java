
// TAGS if, int, methods, operators-arithmetic, operators-relational, parameters, return
/* DESCRIPTION
// https://codingbat.com/prob/p116624
Create a method int diff21(int n)
Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.

diff21(19) → 2
diff21(10) → 11
diff21(21) → 0
 */
 
 
 package diff_21;
 
 import java.util.Scanner;
 
 public class Diff21 {
	 
	 public static Scanner scanner = new Scanner(System.in);
	 
	 public static void main(String[] args) {
		 
		 System.out.println("Enter a number.");
		 int n = scanner.nextInt();
		 
		 int difference = diff21(n);
		 
		 System.out.println(difference);
		 
	 }
	 
	 public static int diff21 (int n) {
		 
		 if (n <= 21) {
			 
			 return 21 - n;
			 
		 } else {
			 
			 return (n - 21) * 2;
			 
		 }
		 
	 }
	 
 }