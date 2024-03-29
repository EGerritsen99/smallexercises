package fibonacci;

// TAGS int, operators-arithmetic, Scanner, Scanner.nextInt(), String-concatenation, System.out.print(), while-loops

/* DESCRIPTION
The Italian mathematician Fibonacci once devised a sequence to model the growth of rabbit populations (one pair would
procreate after two months and then every subsequent month produce another pair which would also procreate after two months

In fact, his sequence turned out to be very bad at modeling rabbit populations, but it is very popular for introductory
computer science courses.

The logic in the sequence is simple: you start with 1 1, and every next number is the sum of the previous two numbers.
So you get a series like 1 1 2 3 5 8 13 21 ... (1+1=2, 1+2=3, 2+3=5, 3+5=8, 5+8=13 etc.)

Create a program that asks for the number up to which to calculate Fibonacci numbers. So if the user wants Fibonacci
numbers up to 1000, the program should produce 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987

Sample run:
Up to which number do you want to generate Fibonacci numbers? 610
1 1 2 3 5 8 13 21 34 55 89 144 233 377 610
 */

import java.util.Scanner;

public class Fibonacci {
	
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Up to which number do you want to generate Fibonacci numbers?");
		int maxNumber = scanner.nextInt();
		
		int fibonacciNumber = 0;
		int fibonacciNumber2 = 1;
		System.out.print(fibonacciNumber2 + " ");
		
		while (fibonacciNumber2 < maxNumber) {
			System.out.print(fibonacciNumber2 + " ");
			
			int newNumber = fibonacciNumber + fibonacciNumber2;
			
			fibonacciNumber = fibonacciNumber2;
			fibonacciNumber2 = newNumber;
			
			
		}
		
	}
	
}