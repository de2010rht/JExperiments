package com.vinsguru.callby;

public class CallByValue {
	public static void main(String args[]) {
		int num = 5;
		int[] arr = new int[] { 3, 5, 7 };
		Integer[] array = new Integer[] { 3, 5, 7 };
		
		modify(num);
		System.out.println("Number: " + num);
		
		modify(arr[1]);
		System.out.println("Primitive array element: " + arr[1]);
		
		modify(array[1]);
		System.out.println("Wrapper array element: " + array[1]);
	}
	
	public static void modify(int n) {
		System.out.print("Received " + n);
		n = 420;
		System.out.println(", Modified to " + n);
	}
}
