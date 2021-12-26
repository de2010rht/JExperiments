package com.pearson.deitel;

import java.util.Scanner;

public class AssertTest {
	/**
	 * If you don't pass '-ea' argument from command line while running this program, the 
	 * assertion error will not be thrown and the porgram will run without any problem.
	 * The '-ea' argument enables the assertion in Java. So, enable this in eclipse IDE.
	 * Go to 'Run Configurations...', open 'Arguments' tab, enter '-ea' in 'VM arguments'.
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number between 0 and 10 : ");
		int number = scanner.nextInt();
		
		assert(number >= 0 && number <= 10) : "Entered number " + number + " is bad";
		System.out.printf("You entered %d%n", number);
		scanner.close();
	}

}
