package com.pearson.deitel.grade;

public class GradeBookTest {

	public static void main(String[] args) {
		int[] grades = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
		
		GradeBook gradeBook = new GradeBook("Introduction to OOP", grades);
		System.out.printf("Welcome to the grade book for%n%s%n%n", gradeBook.getCourse());
		gradeBook.processGrades();
	}

}
