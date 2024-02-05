// TAGS operators-arithmetic, remainder-operator, Scanner, Scanner.nextInt(), System.out.print()

/* DESCRIPTION
https://www.w3resource.com/java-exercises/basic/index.php
Write a Java program to convert seconds to hour, minute and seconds.
Sample Output:

Input seconds: 86399
23:59:59
 */
 
 package seconds_to_hour;
 
 import java.util.Scanner;
 
 public class SecondsToHourMinutesAndSeconds {
	 
	 public static Scanner scanner = new Scanner(System.in);
	 
	 public static void main(String[] args) {
		 
		 System.out.println("Enter a number.");
		 int number = scanner.nextInt();
		 
		 int hours = number / 3600;
		 
		 int minutes = getMinutes(number);
		 
		 int seconds = getSeconds(number);
		 
		 System.out.println(hours + ":" + minutes + ":" + seconds);
		 
	 }
	 
	 public static int getMinutes(int numberOfSeconds) {
		 
		 int secondsLeft = numberOfSeconds % 3600;
		 
		 int minutes = secondsLeft / 60;
		 
		 return minutes;
		 
	 }
	 
	 public static int getSeconds(int numberOfSeconds) {
		 
		 int secondsLeft = numberOfSeconds % 60;
		 
		 return secondsLeft;
		 
	 }
	 
 }