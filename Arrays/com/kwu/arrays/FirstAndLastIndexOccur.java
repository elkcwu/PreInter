package com.kwu.arrays;

public class FirstAndLastIndexOccur {
	
	public static void findFirstAndLastIndex(int[]arrInt, int target){
		int first = -1, last = -1;
		int n = arrInt.length;
		for(int i= 0; i<n; i++){
			if(arrInt[i] == target){
				if(first == -1){
					first = i;
				}else{
					last = i;
				}
			}				
		}	
		if(first != -1)
			System.out.println("the first index is: " + first + " and the last index is: " + last);
		else
			System.out.println("none is found");
	}
	
	public static void main(String[]args){
		int[] arrInt = new int[] {17,3,5,7,4,9,7,8,7,5,10};
		int target = 7;
		findFirstAndLastIndex(arrInt, target);
		
	}
}
