package com.strings;

public class Concat {

	public static void main(String[] args) {
		/**
		 * One String object is created with content 'Happy' which is referenced by s1
		 */
		String s1 = "Happy";
		
		/**
		 * Two String objects are created, one with content 'Birthday' but without any reference, 
		 * the other contains 'Birthday' which is referenced by s2
		 */
		String s2 = new String("Birthday");
		
		System.out.printf("s1 = %s%ns2 = %s%n", s1, s2);
		System.out.printf("Result of concatenation = %s%n", s1.concat(" ").concat(s2));
		System.out.printf("s1 after concatenation = %s%n", s1);
	}

}
