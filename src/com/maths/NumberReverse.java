package com.maths;

import java.util.Scanner;

public class NumberReverse {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number to reverse: ");
		int n = scanner.nextInt();
		System.out.println("Reverse of " + n + " is " + reverse(n));
	}
	
	public static int reverse(int num) {
		int rev = 0;
		while (num != 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num /= 10;
		}
		return rev;
	}

}
