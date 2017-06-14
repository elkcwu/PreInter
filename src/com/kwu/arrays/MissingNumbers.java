package com.kwu.arrays;

import java.util.Arrays;
import java.util.BitSet;

public class MissingNumbers {
	
	public static void main(String[]args){
		 
		findingMissingNumbers(new int[] {1,2,4,5,6,8,9,10}, 10);
		findOneMissingNumber(new int[] {1,2,3,4,5,6,8,9,10}, 10);
	}
	
	//this one can find any missing numbers
	public static void findingMissingNumbers(int[] ints, int count){
		int missingCount = count - ints.length;
		BitSet bs = new BitSet();
		for(int number : ints){
			bs.set(number - 1);
		}
		
		System.out.printf("Missing numbers in integer array %s, with total number %n", Arrays.toString(ints), count);
		
		int lastMissingIndex = 0;
		for(int i=0; i<missingCount; i++){
			lastMissingIndex = bs.nextClearBit(lastMissingIndex);
			System.out.println(++lastMissingIndex);
		}
	}
	
	
	//this one can only find one missing number
	public static void findOneMissingNumber(int[] intArr, int totalCount){
		int expectedSum =  totalCount * (totalCount +1)/2;
		int actualSum = 0;
		for(int i : intArr){
			actualSum += i;
		}
		
		System.out.printf("the missing number is: %n" + (expectedSum - actualSum));
	}

}
