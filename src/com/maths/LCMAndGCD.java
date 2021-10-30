package com.maths;

import java.util.Scanner;

public class LCMAndGCD {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int num1 = scanner.nextInt();
		System.out.print("Enter second number: ");
		int num2 = scanner.nextInt();
		System.out.println("HCF of " + num1 + " and " + num2 + ": " + gcd(num1, num2));
		System.out.println("LCM of " + num1 + " and " + num2 + ": " + lcm(num1, num2));
	}
	
	public static int gcd(int a, int b) {
		if (a > b) {
			int r = a % b;
			while (r != 0) {
				a = b;
				b = r;
				r = a % b;
			}
			return b;
		} else {
			int r = b % a;
			while (r != 0) {
				b = a;
				a = r;
				r = b % a;
			}
			return a;
		}
	}
	
	public static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}

}
