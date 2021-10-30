package com.imocha;

import java.util.Arrays;

public class ArraysCopy {

	public static void main(String[] args) {
		int arr[] = {2, 3, 4};
		int array[] = Arrays.copyOf(arr, 4);
		System.out.println(array[3]);
	}

}
