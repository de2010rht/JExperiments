package com.maths;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the number for factorial calculation: ");
		int num = Integer.parseInt(br.readLine());
		System.out.println("Factorial of " + num + " in recursion: " + factRecursion(num));
		System.out.println("Factorial of " + num + " in iteration: " + factIterative(num));
	}
	
	public static int factRecursion(int n) {
		if (n <= 2)
			return 2;
		return n * factRecursion(n - 1);
	}
	
	public static int factIterative(int n) {
		if (n <= 2)
			return 2;
		int fact = 2;
		do {
			fact *= n--;
		} while (n > 2);
		return fact;
	}

}
