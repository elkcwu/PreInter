package com.kwu.strings;

public class ReplaceCharInString {

		public static void replaceChar(String str, char from, char to){
			char [] strChar = str.toCharArray();
			
			for(int i = 0; i<strChar.length; i++){
				if(strChar[i] == from){
					strChar[i] = to;
				}				
			}
			
			System.out.println(new String(strChar));
		}
		
		public static String replaceCharRecursion(String str, char from, char to){
			if(str.length() < 1){
				return str;
			}
			else{
				char first = from == str.charAt(0) ? to : str.charAt(0);
				return first + replaceCharRecursion(str.substring(1), from, to);
			}
			
		}
		
		
		public static void main(String[]args){
			String str = "This is a string";
			char from = 's';
			char to = '#';
			
			replaceChar(str, from, to);
			
			////
			System.out.println("Replace with Recursin: " + replaceCharRecursion(str, from, to));
		}
}
