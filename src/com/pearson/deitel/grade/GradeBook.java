package com.pearson.deitel.grade;

public class GradeBook {
	private String course;
	private int[] grades;
	
	/**
	 * @param course
	 * @param grades
	 */
	public GradeBook(String course, int[] grades) {
		this.course = course;
		this.grades = grades;
	}

	/**
	 * @return the course
	 */
	public String getCourse() { return course; }

	/**
	 * @param course the course to set
	 */
	public void setCourse(String course) { this.course = course; }
	
	public void processGrades() {
		outputGrades();
		System.out.printf("%nClass average is %.2f%n", getAvg());
		System.out.printf("Lowest grade is %d%nHighest grade is %d%n%n", getMin(), getMax());
		outputBarChart();
	}
	
	private int getMin() {
		int lowest = grades[0];
		for (int i = 1; i < grades.length; i++)
			if (grades[i] < lowest)
				lowest = grades[i];
		return lowest;
	}
	
	private int getMax() {
		int highest = grades[0], i = 1;
		while (i < grades.length)
			if (grades[i] > highest)
				highest = grades[i++];
		return highest;
	}
	
	private double getAvg() {
		int sum = 0;
		for (int grade : grades)
			sum += grade;
		return (double) sum / grades.length;
	}
	
	private void outputGrades() {
		System.out.printf("The grades are:%n%n");
		for (int student = 0; student < grades.length; student++)
			System.out.printf("Student %2d: %3d%n", student + 1, grades[student]);
	}
	
	private void outputBarChart() {
		System.out.println("Grade distribution:");
		
		int[] frequency = new int[11];	// stores frequency of grades in each range of 10 grades
		for (int grade : grades)
			++frequency[grade / 10];	// for each grade, increment the appropriate frequency
		
		// for each grade frequency, print bar in chart
		for (int count = 0; count < frequency.length; count++) {
			// output bar label ("00-09: ", ..., "90-99: ", "100: ")
			if (count == 10)
				System.out.printf("%5d: ", 100);
			else
				System.out.printf("%02d-%02d", count * 10, count * 10 + 9);
			
			// print bar of asterisks
			for (int stars = 0; stars < frequency[count]; stars++)
				System.out.print("*");
			System.out.println();
		}
	}
}
