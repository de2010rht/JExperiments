package com.pearson.deitel.io.enquiryprogram;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreditInquire {
	private static final MenuOptions[] CHOICES = MenuOptions.values();

	public static void main(String[] args) {
		MenuOptions accontType = getRequest();
		while (accontType != MenuOptions.END) {
			switch (accontType) {
			case ZERO_BALANCE:
				System.out.printf("%nAccounts with zero balance:%n");
				break;
			case CREDIT_BALANCE:
				System.out.printf("%nAccounts with credit balance:%n");
				break;
			case DEBIT_BALANCE:
				System.out.printf("%nAccounts with debit balance:%n");
				break;
			default:
				break;
			}
			readRecords(accontType);
			accontType = getRequest();
		}
	}

	private static MenuOptions getRequest() {
		int request = 4;
		System.out.printf("%nEnter request%n%s%n%s%n%s%n%s%n", 
				" 1 - List accounts with with zero balances", 
				" 2 - List accounts with credit balances", 
				" 3 - List accounts with debit balances", 
				" 4 - Terminate program");
		
		try {
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			do {
				System.out.printf("%n? ");
				request = scanner.nextInt();
			} while (request < 1 || request > 4);
		} catch (NoSuchElementException e) {
			System.err.println("Invalid input. Terminating...");
		}
		return CHOICES[request - 1];
	}
	
	private static void readRecords(MenuOptions menu) {
		try (Scanner scanner = new Scanner(Paths.get("files/records.txt"))) {
			while (scanner.hasNext()) {
				int accountNum = scanner.nextInt();
				String fName = scanner.next();
				String lName = scanner.next();
				double bal = scanner.nextDouble();
				
				if (shouldDisplay(menu, bal))
					System.out.printf("%-10d%-12s%-12s%10.2f%n", accountNum, fName, lName, bal);
				else
					scanner.nextLine();
			}
		} catch (NoSuchElementException | IllegalStateException | IOException e) {
			System.err.println("Error processing file. Terminating...");
			System.exit(1);
		}
	}
	
	private static boolean shouldDisplay(MenuOptions menu, double balance) {
		if (menu == MenuOptions.CREDIT_BALANCE && balance < 0)
			return true;
		else if (menu == MenuOptions.DEBIT_BALANCE && balance > 0)
			return true;
		else if (menu == MenuOptions.ZERO_BALANCE && balance == 0)
			return true;
		else
			return false;
	}
}
