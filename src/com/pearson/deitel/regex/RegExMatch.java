package com.pearson.deitel.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExMatch {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("J.*\\d[0-35-9]-\\d\\d-\\d\\d");
		
		String string = "Jane's Birthday is 05-12-78\n" +
				"Dave's Birthday is 11-04-68\n" + 
				"John's Birthday is 04-28-73\n" + 
				"Joe's Birthday is 12-17-77";
		
		Matcher matcher = pattern.matcher(string);
		while (matcher.find())
			System.out.println(matcher.group());
	}

}
