package com.kwu.numbers;

public class Pring1to100WithoutLoop {

		public static void main(String[]args){
			
			//use recursion to print
			int num = 100;
			printWithRecursion(num);
			
		}
		public static void printWithRecursion(int num){
			if(num > 1){
				
				printWithRecursion(num - 1);
			}
			
			System.out.println(num);
		}
}

