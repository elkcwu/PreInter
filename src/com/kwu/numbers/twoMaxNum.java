package com.kwu.numbers;

public class twoMaxNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int [] numList = {2};
		int [] numList = {-2,-5,1,-9, -2, 7, -7};
		twoMaxNums(numList);
		maxAndMin(numList);
		
	}

	private static void twoMaxNums(int[] numList) {
		if(numList.length <= 1)
			return;
		
//		int max1 = 0, max2 = 0;  //totally wrong	
		//should initialize with the first value
		int max1 = numList[0], max2=numList[0], max3= numList[0];
		for(int i = 1; i<numList.length; i++){
			if(numList[i]>max1){
				max3 = max2;
				max2 = max1;
				max1 = numList[i];
			}else if(numList[i]>max2){
				max3 = max2;
				max2 = numList[i];
			}else if(numList[i]>max3){
				max3 = numList[i];
			}
		}
				
		System.out.println("max1 is : " + max1 + " max2 is : " + max2  + " max3 is: " + max3);
	}
	
	private static void maxAndMin(int[] numList){
		if(numList.length <= 1)
			return;
		int max = numList[0], min = numList[0];
		
		for(int i = 1; i< numList.length; i++ ){
			if(numList[i] > max)
				max = numList[i];
			else if(numList[i]< min)
				min = numList[i];
		}
		System.out.println("max is : " + max + " min is : " + min);
	}

}
