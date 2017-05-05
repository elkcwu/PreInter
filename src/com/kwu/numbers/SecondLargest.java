package com.kwu.numbers;

public class SecondLargest {

	public int getTheSecondLargestNum(int[] numList){
		int firstLargest = numList[0];
		int secondLargest = numList[0];	
		
		for(int i=1; i<numList.length; i++){
			if(numList[i]>firstLargest){
				secondLargest = firstLargest;
				firstLargest = numList[i];
			}else if(numList[i] > secondLargest){
				secondLargest = numList[i];
			}
		}		
		return secondLargest;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SecondLargest sl = new SecondLargest();
		
		int[] numList = {3,8,5,9,2,12, 11};
		
		if(numList.length < 2){
			System.out.println("invalid parameta");
			return;
		}
		int secLargest = sl.getTheSecondLargestNum(numList);
		System.out.println("The second largest in array is: " + secLargest);
		
	}

}
