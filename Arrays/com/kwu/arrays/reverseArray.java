package com.kwu.arrays;

import java.util.Arrays;

public class reverseArray {
	public static void main(String[]args){
		int [] arr1 = {12, 10, 9, 7, 5, 3};
		
		String reverseArr = reverseTheArray(arr1);
		System.out.println(reverseArr);
		
	}
	//Reverse an array in-place, without using an additional buffer.
	//O(n/2) or time complexity: O(n), space complexity is O(1)
	public static String reverseTheArray(int[] arr1){
		if(arr1 == null || arr1.length<2)
			return arr1.toString();
		
		for(int i = 0; i < (arr1.length / 2); i++){
			int temp = arr1[i];
			arr1[i] = arr1[arr1.length - i - 1];
			arr1[arr1.length - i - 1] = temp;			
		}
		
		return Arrays.toString(arr1);
	}
}
