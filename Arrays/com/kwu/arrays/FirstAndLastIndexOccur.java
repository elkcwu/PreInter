package com.kwu.arrays;

public class FirstAndLastIndexOccur {
	
	//Naive thinking:  O(n)
	public static void findFirstAndLastIndex(int[]arrInt, int target){
		int first = -1, last = -1;
		int n = arrInt.length;
		int nOccu = 0;
		for(int i= 0; i<n; i++){
			if(arrInt[i] == target){
				nOccu++;
				if(first == -1){
					first = i;
				}else{
					last = i;
				}
			}				
		}	
		if(first != -1){
			System.out.println("the first index is: " + first + " and the last index is: " + last);
			System.out.println("number of Occurance: " + nOccu);
		}else
			System.out.println("none is found");
	}
	
	//efficient solution: Binary search: O(log n)
	public static void findFirstAndLastIndexBinarySearch(int[]arrInt, int target){
		int n = arrInt.length;
		findFirst()
		firsLast();
	}
	
	private static void findFirst(int []firstHalfArray, int target){
		
	}
	
	private static void findLast(int [] lastHalfArray, int target){
		
	}
	
	//////////////////////
	
	public static void main(String[]args){
		int[] arrInt = new int[] {17,3,5,7,4,9,7,8,7,5,10};
		int target = 7;
		findFirstAndLastIndex(arrInt, target);
		
		findFirstAndLastIndexBinarySearch(arrInt, target);
		
	}
}
