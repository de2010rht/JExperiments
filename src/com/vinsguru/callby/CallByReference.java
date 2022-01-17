package com.vinsguru.callby;

public class CallByReference {

	public static void main(String[] args) {
		int[] array = new int[] { 3, 5, 7 };
		
		System.out.print("Array before modification:\t");
		for (int n : array)
			System.out.printf("%d\t", n);
		
		modify(array);
		System.out.print("\nArray after modification:\t");
		for (int n : array)
			System.out.printf("%d\t", n);
	}
	
	public static void modify(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			arr[i] *= 5; 
	}

}
