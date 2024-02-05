// TAGS methods, operators-arithmetic, operators-relational, parameters, remainder-operator, return

/* DESCRIPTION
https://codingbat.com/prob/p125339
Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57. 
Note that the % "mod" operator computes remainders, so 17 % 10 is 7.

lastDigit(7, 17) → true
lastDigit(6, 17) → false
lastDigit(3, 113) → true
 */
 
 package lastdigit;
 
 import java.util.Scanner;
 
 class LastDigit {
	 
	 public static Scanner scanner = new Scanner(System.in);
	 
	 public static void main(String[] args) {
		 
		 int digit1 = getDigit();
		 int digit2 = getDigit();
		 
		 boolean isSame = isSame(digit1, digit2);
		 
		 System.out.println(isSame);
		 
	 }
	 
	 public static int getDigit() {
		 
		 System.out.println("Enter a digit higher than 0.");
		 int newDigit = scanner.nextInt();
		 
		 while (newDigit < 0) {
			 
			 System.out.println("Please enter a digit higher than 0.");
			 newDigit = scanner.nextInt();
			 
		 }
		 
		 return newDigit;
		 
	 }
	 
	 public static boolean isSame(int digit1, int digit2) {
		 
		 if ((digit1 % 10) == (digit2 % 10)) {
			 
			 return true;
			 
		 } else {
			 
			 return false;
			 
		 }
		 
	 }
	 
 }
