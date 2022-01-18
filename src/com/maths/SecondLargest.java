package com.maths;

public class SecondLargest {
	
	public static int getSecondLargestFromArray(int[] arr) {
		int first = arr[0], second = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (first < arr[i]) {
				second = first;
				first = arr[i];
			}
			else {
				if (arr[i] > second && arr[i] != first)
					second = arr[i];
			}
		}
		return second;
	}

	public static void main(String[] args) {
		int[] array = new int[] { 5, 11, 27, 63, 9, 14 };
		System.out.println("The second largest number is " + getSecondLargestFromArray(array));
	}

}
