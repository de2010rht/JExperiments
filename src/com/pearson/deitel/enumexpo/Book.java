package com.pearson.deitel.enumexpo;

public enum Book {
	JHTP("Java How To Program", "2015"),
	CHTP("C How To Program", "2013"),
	IW3HTP("Internet & World Wide Web How To Program", "2012"),
	CPPHTP("C++ How To Program", "2014"),
	VBHTP("Visual Basic Hot To Program", "2014"),
	CSHARPHTP("C# How To Program", "2014");
	
	private final String title;
	private final String copyrightYear;
	
	Book(String title, String copyrightYear) {
		this.title = title;
		this.copyrightYear = copyrightYear;
	}

	/**
	 * @return the title
	 */
	public String getTitle() { return title; }

	/**
	 * @return the copyrightYear
	 */
	public String getCopyrightYear() { return copyrightYear; }
}
