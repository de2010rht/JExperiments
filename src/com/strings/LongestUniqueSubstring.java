package com.strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestUniqueSubstring {

	public static void main(String[] args) {
		String input = "RATANTATA";
		System.out.println("Longest substring of \"" + input + "\" : " + getLongestSubstring(input));
	}
	
	public static String getLongestSubstring(String str) {
		if (str == null || str.isEmpty())
			return str;
		Map<Character, Integer> count = new LinkedHashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (count.containsKey(c))
				count.replace(c, count.get(c), count.get(c) + 1);
			else
				count.put(c, 1);
		}
		String subString = "";
		for (Map.Entry<Character, Integer> entry : count.entrySet()) {
			if (entry.getValue() == 1)
				subString += entry.getKey();
			else {
				if (!subString.contains(entry.getKey() + ""))
					subString += entry.getKey();
			}
		}
		return subString;
	}

}
