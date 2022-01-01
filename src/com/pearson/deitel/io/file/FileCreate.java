package com.pearson.deitel.io.file;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FileCreate {
	private Formatter formatter;
	
	public void createFile() {
		openFile();
		addRecords();
		closeFile();
	}
	
	private void openFile() {
		try {
			formatter = new Formatter("files/records.txt");
		} catch (SecurityException e) {
			System.err.println("Write permission denied. Terminating...");
			System.exit(1);
		} catch (FileNotFoundException e) {
			System.err.println("Error opening file. Terminating...");
			System.exit(1);
		}
	}
	
	private void addRecords() {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("%s%n%s%n? ", "Enter account number, first name, last name and balance.", 
				"Enter EOF or End-of-File indicator to stop input...");
		
		while (scanner.hasNext()) {
			try {
				formatter.format("%d %s %s %.2f%n", scanner.nextInt(), scanner.next(), scanner.next(), scanner.nextDouble());
			} catch (FormatterClosedException e) {
				System.err.println("Error writing to file. Terminating...");
				break;
			} catch (NoSuchElementException e) {
				System.err.println("Invalid input. Please try again.");
				scanner.nextLine();
			}
			System.out.print("? ");
		}
		scanner.close();
	}
	
	private void closeFile() {
		if (formatter != null)
			formatter.close();
	}
}
