package com.kwu.strings;

import java.util.Arrays;


public class StringAnagrams {
	
	public boolean isAnagram1(String word, String anagram){
		
		char[] cha1 = word.toLowerCase().toCharArray();
		char[] cha2 = anagram.toLowerCase().toCharArray();
		if(cha1.length< 2 && cha2.length < 2){
			System.out.println("Illegal parameters ");
			return false;
		}else if(cha1.length != cha2.length){
			return false;
		}
		
		Arrays.sort(cha1);
		Arrays.sort(cha2);
		
		return Arrays.equals(cha1, cha2);
	}
	
	public boolean isAnagram2(String word, String anagram){
		char[] cha = word.toCharArray();
		StringBuilder sb = new StringBuilder(anagram);
		
		
		
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
