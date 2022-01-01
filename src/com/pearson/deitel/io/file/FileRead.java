package com.pearson.deitel.io.file;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FileRead {
	private Scanner scanner;
	
	public void readFile() {
		openFile();
		readRecords();
		closeFile();
	}
	
	private void openFile() {
		try {
			scanner = new Scanner(Paths.get("files/records.txt"));
		} catch (IOException e) {
			System.err.println("Error opening file. Terminating...");
			System.exit(1);
		}
	}
	
	private void readRecords() {
		System.out.printf("%n%-10s%-12s%-12s%-10s%n", "Account", "First Name", "Last Name", "Balance");
		
		try {
			while (scanner.hasNext()) {
				System.out.printf("%-10d%-12s%-12s%-10.2f%n", scanner.nextInt(), scanner.next(), scanner.next(), scanner.nextDouble());
			}
		} catch (NoSuchElementException e) {
			System.err.println("File improperly created. Terminating...");
		} catch (IllegalStateException e) {
			System.err.println("Error reading from file. Terminating...");
		}
	}
	
	private void closeFile() {
		if (scanner != null)
			scanner.close();
	}
}
