package com.pearson.deitel.regex;

/**
 * @author ROHITASWA
 * Character		Matches								Character		Matches
 * \d				any digit							\D				any non-digit
 * \w				any word character					\W				any non-word character
 * \s				any white-space character			\S				any non-whitespace character
 * 
 * Quantifier		Matches
 * *				Matches zero or more occurrences of the pattern
 * +				Matches one or more occurrences of the pattern
 * ?				Matches zero or one occurrence of the pattern
 * {n}				Matches exactly n occurrences
 * {n,}				Matches at least n occurrences
 * {n,m}			Matches between n and m (inclusive) occurrences
 */

public class RegExUtil {
	public static boolean validateFirstName(String firstName) {
		return firstName.matches("[A-Z][a-zA-Z]*");
	}
	
	public static boolean validateLastName(String lastName) {
		return lastName.matches("[a-zA-Z]+(['-][a-zA-Z]+)*");
	}
	
	public static boolean validateAddress(String address) {
		return address.matches("\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
	}
	
	public static boolean validateCity(String city) {
		return city.matches("([a-zA-Z]+|[a-zA-Z]+\\\\s[a-zA-Z]+)");
	}
	
	public static boolean validateState(String state) {
		return state.matches("([a-zA-Z]+|[a-zA-Z]+\\\\s[a-zA-Z]+)");
	}
	
	public static boolean validateZip(String zip) {
		return zip.matches("\\d{5}");
	}
	
	public static boolean validatePhone(String phone) {
		return phone.matches("[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}");
	}
}
