package com.kwu.strings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RepeatedCharInString {
	
	@SuppressWarnings("finally")
	public static void printRepeatedChars(String str){
		if(str.length()<=1){
			try{ // force to have exception
				throw new Exception("MyException");
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				return;
			}
		}
		
		char [] strChar = str.toCharArray(); //convert string to char array
		Map<Character, Integer>charMap = new HashMap<Character, Integer>(); //create map object
		for(char c : strChar){  //loop char array  Java 5
			if(c != ' '){  //
				if(charMap.containsKey(c)){			
					charMap.put(c, (charMap.get(c) + 1));  //get map value with key and put to map, map key can not be duplicated
				}else{
					charMap.put(c, 1); //add the first value 
				}
			}
		}
				
		for(Character c : charMap.keySet()){  //return a set of the keys
			if(charMap.get(c) > 1)
				System.out.println("this charcter " + c + " is repeated " +  charMap.get(c) + " times");
		}
		
		//print the first non-repeated character
		for(Character c : charMap.keySet()){  //return a set of the keys
			if(charMap.get(c) == 1){
				System.out.println("\n");
				System.out.println("this charcter is the first non-repeated character: " + c);
				break;
			}
		}
		
	}
	
	public static void main	(String[]args){
		String str = "There is repeated characters in this string";
		printRepeatedChars(str);
	}

}
