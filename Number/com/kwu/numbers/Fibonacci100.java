package com.kwu.numbers;


// http://www.java67.com/2016/05/fibonacci-series-in-java-using-recursion.html
public class Fibonacci100 {
	
	public static int fibonacciRecursion(int fab){
		//fibonacci number is sum of previous two fibonacci number 
		//Fn = F(n-1) + F(n-2); n is the index
		// 1,1,2,3,5,8,13,21,34,55
		
		// fib number 8 = array index (5-1) + (5-2) == index 4 is 5 and index 3 is 3 == 
		// 5 + 3 = 8
		
		if(fab==1 || fab == 2){
			return 1;
		}
		return fibonacciRecursion(fab-1) + fibonacciRecursion(fab-2); //tail recursion
	}
	
	
	public static void fibonacciIteration(int fab){
		
	}
	
	public static void main(String[]args){
		//fibonacci seris upt to 100
		
			
		int fab = 100; 
		
		//recurseive 
		System.out.println("fibonacci in Recursion: ");
		for(int i=1; i<=fab; i++){
			System.out.print(fibonacciRecursion(i) + " ");
		}
		
		
		////iterative
		fibonacciIteration(fab);
		
	}
	
}
