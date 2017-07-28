package com.kwu.arrays;

public class FirstAndLastIndexOccur {
	
	public static void findFirstAndLastIndex(int[]arrInt, int target){
		int first = -1, last = -1;
		int index = 0;
		for(int i : arrInt){
			if(i == target){
				if(first == -1){
					first = index;
				}else{
					last = index;
				}
			}
			index++;			
			
		}		
	}
	
	public static void main(String[]args){
		int[] arrInt = new int[] {1,3,5,7,4,9,7,8,7,5,10};
		int target = 7;
		findFirstAndLastIndex(arrInt, target);
		
	}
}
