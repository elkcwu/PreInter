package com.kwu.strings;

public class ReverseStrings {
	
	public static void main(String[] args){
		String str1 = "abcdefg";
		String str2 = "This is a string";
		
		System.out.println("the reverse of this string: " + str1 + " is: " + reverseWithArray(str1));
		System.out.println("another one " + str2 + " is: " + reverseWithArray(str2));
		
		System.out.println("reverse with strinbuilder: " + reverseWithStringBuilder(str2));
		
	}
	
	public static String reverseWithArray(String str1){
		if(str1.length() < 2)
			return str1;
		
		char[] chars = str1.toCharArray();
		for(int i=0; i<chars.length/2; i++){
			char tempChar = chars[i];
			chars[i] = chars[chars.length - i - 1];
			chars[chars.length - i - 1] = tempChar;
		}
		
		return new String(chars);
	}
	
	public static String reverseWithStringBuilder(String str2){
		StringBuilder strB = new StringBuilder();
		char[] chars = str2.toCharArray();
		for(int i = chars.length -1; i >= 0; i--){
			strB = strB.append(chars[i]);		
		}
		return strB.toString();
		
	}
}
