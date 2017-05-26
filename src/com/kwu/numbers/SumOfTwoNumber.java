package com.kwu.numbers;

import java.util.HashSet;
import java.util.Set;

public class SumOfTwoNumber {

		public static void main(String[]args){
			int[] intArr = {3,1, 8, 5,9,4,7,11};
			int target = 8;
			sumOfTwoNum(intArr, target);
			
		}
		
		//this one use Set
		public static void sumOfTwoNum(int[] intArr, int sum){
			if(intArr.length<2){
				return;
			}
					
			Set<Integer> arrSet = new HashSet<Integer>();
			for(int i : intArr){
				int target = sum - i;
				if(!arrSet.contains(target)){
					arrSet.add(i);
				}else{
					System.out.println("nums is: " + target + " and " + i);
				}
			}
			
		}
		
		
		//this one use HashMap
		public static vid sumOfTwoNumberWithMap(int[] intArr, int sum){
			
			
		}
}
