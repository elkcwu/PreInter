package com.kwu.strings;

import java.util.HashMap;
import java.util.Map;

public class StringAppearCounts {
	public static void main(String[]args){
		String[] strArray = {
			      "900,google.com",
			      "60,mail.yahoo.com",
			      "10,mobile.sports.yahoo.com",
			      "40,sports.yahoo.com",
			      "300,yahoo.com",
			      "10,stackoverflow.com",
			      "2,en.wikipedia.org",
			      "1,es.wikipedia.org"
			    };
		
		Map<String, Integer> results = new HashMap<String, Integer>();
		stringCount(strArray, results);
		printStringArray(results);
	}
	
	
	public static void stringCount(String[] strArray, Map<String, Integer> result){
		if(strArray.length<2){
			return;
		}
		
		for(String str1 : strArray){
			String[] strArr1 = str1.split(","); 
			if(result.containsKey(strArr1[0])){
				result.put(strArr1[1], result.get(strArr1[0]) + Integer.parseInt(strArr1[0]));
			}else{
				
				
				
			}	
				result.put(strArr1[1], result.get(strArr1[0]));
			}
		}
		
		
	}
	
	public static void printStringArray(Map<String, Integer> result){
		
	}
}
