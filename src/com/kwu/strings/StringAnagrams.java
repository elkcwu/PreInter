package com.kwu.strings;


public class StringAnagrams {
	
	public boolean isAnagram1(String word, String anagram){
		
		char[] cha1 = word.toCharArray();
		char[] cha2 = anagram.toCharArray();
		
		
		return false;
	}
	
	public boolean isAnagram2(String word, String anagram){
		
		return false;
	}
	
	public static void main(String[]args){
		
		StringAnagrams stAn = new StringAnagrams();
		String str1 = "mary";
		String str2 = "army";
				
		System.out.println("is anagram? " + stAn.isAnagram1(str1, str2));
		
		str1 = "kevin";
		str2 = "kevi";
		System.out.println("is anagram: " + str1 + " " + str2 + " " + stAn.isAnagram2(str1, str2));
	}

}
