package com.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckVowelPresence {

	public static void main(String[] args) {
		String string = "RATAN";
		System.out.println(isVowelPresent(string));
	}
	
	public static boolean isVowelPresent(String str) {
		Pattern pattern = Pattern.compile(".*[aeiouAEIOU].*");
		Matcher matcher = pattern.matcher(str);
		return matcher.matches();
	}

}
