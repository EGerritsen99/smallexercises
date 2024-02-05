// TAGS boolean, if, methods, operators-logical, parameters, return

/* DESCRIPTION
https://codingbat.com/prob/p187868

Create a method, boolean sleepIn(boolean weekday, boolean vacation)

The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. 
We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
sleepIn(false, false) → true
sleepIn(true, false) → false
sleepIn(false, true) → true
 */
 
 
 package sleepin;
 
 import java.util.Scanner;
 
 public class SleepIn {
	 
	 public static Scanner scanner = new Scanner(System.in);
	 
	 public static void main(String[] args) {
		 
		 System.out.println("Is it a weekday?");
		 boolean weekday = scanner.nextBoolean();
		 
		 
		 System.out.println("Are we on vacation?");
		 boolean vacation = scanner.nextBoolean();
		 
		 boolean doWeSleepIn = sleepIn(weekday, vacation);
		 
		 
		 if (doWeSleepIn) {
			 
			 System.out.println("We can sleep in!");
			 
		 } else {
			 
			 System.out.println("We have to get up early.");
			 
		 }
		 
		 
	 }
	 
	 
	 public static boolean sleepIn(boolean weekday, boolean vacation) {
		 
		 if (!weekday || vacation) {
			 
			 return true;
			 
		 } else {
			 
			 return false;
			 
		 }
		 
	 }
	 
 }