package com.pearson.deitel.regex;

import java.util.Scanner;

public class TestRexEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first name:");
		String fn = scanner.nextLine();
		System.out.println("Enter last name:");
		String ln = scanner.nextLine();
		System.out.println("Enter address:");
		String addr = scanner.nextLine();
		System.out.println("Enter city:");
		String city = scanner.nextLine();
		System.out.println("Enter state:");
		String state = scanner.nextLine();
		System.out.println("Enter zip code:");
		String zip = scanner.nextLine();
		System.out.println("Enter phone in nnn-nnn-nnnn format:");
		String ph = scanner.nextLine();
		scanner.close();
		
		System.out.printf("%nValidating inputs:");
		if (!RegExUtil.validateFirstName(fn))
			System.out.println("Invalid first name");
		else if (!RegExUtil.validateLastName(ln))
			System.out.println("Invalid last name");
		else if (!RegExUtil.validateAddress(addr))
			System.out.println("Invalid address");
		else if (!RegExUtil.validateCity(city))
			System.out.println("Invalid city");
		else if (!RegExUtil.validateState(state))
			System.out.println("Invalid state");
		else if (!RegExUtil.validateZip(zip))
			System.out.println("Invalid zip code");
		else if (!RegExUtil.validatePhone(ph))
			System.out.println("Invalid phone");
		else
			System.out.println("Valid input... Thank you!");
	}

}
