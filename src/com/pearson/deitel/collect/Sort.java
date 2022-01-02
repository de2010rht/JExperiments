package com.pearson.deitel.collect;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort {

	public static void main(String[] args) {
		String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
		List<String> list = Arrays.asList(suits);
		
		System.out.print("Array elements before list sorting: [");
		for (int i = 0; i < suits.length; i++)
			System.out.print(i == suits.length - 1 ? suits[i] + "]\n" : suits[i] + ", ");
		System.out.printf("Unsorted list elements: %s%n", list);
		
		Collections.sort(list);
		System.out.print("\nArray elements after list sorting: [");
		for (int i = 0; i < suits.length; i++)
			System.out.print(i == suits.length - 1 ? suits[i] + "]\n" : suits[i] + ", ");
		System.out.printf("Sorted list elements: %s%n", list);
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.print("\nArray elements after list sorting in reverse order: [");
		for (int i = 0; i < suits.length; i++)
			System.out.print(i == suits.length - 1 ? suits[i] + "]\n" : suits[i] + ", ");
		System.out.printf("Sorted list elements in reverse order: %s", list);
 	}

}
