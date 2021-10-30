package com.maths;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Armstrong {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter number to check armstrong: ");
		System.out.println(isArmstrong(Integer.parseInt(br.readLine())));
	}
	
	public static boolean isArmstrong(int n) {
		int arm = 0, num = n;
		while (n != 0) {
			int r = n % 10;
			arm += r * r * r;
			n /= 10;
		}
		return num == arm;
	}

}
