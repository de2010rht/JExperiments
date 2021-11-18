package com.strings;

public class ReverseStr {

	public static void main(String[] args) {
		String input = "Ramakant";
		System.out.println("Reverse of \"" + input + "\" : " + reverse(input));
		System.out.println("Reverse of \"" + input + "\" : " + reverseRec(input));
		System.out.println("Reverse of \"" + input + "\" : " + reverseBuild(input));
	}
	
	public static String reverse(String str) {
		if (str == null || str.isEmpty())
			return str;
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--)
			rev += str.charAt(i) + "";
		return rev;
	}
	
	public static String reverseRec(String str) {
		if (str == null || str.isEmpty())
			return str;
		return reverse(str.substring(1)) + str.charAt(0);
	}
	
	public static String reverseBuild(String str) {
		if (str == null || str.isEmpty())
			return str;
		char[] chArr = str.toCharArray();
		StringBuilder builder = new StringBuilder();
		for (int i = chArr.length - 1; i >= 0; i--)
			builder.append(chArr[i]);
		return builder.toString();
	}

}
