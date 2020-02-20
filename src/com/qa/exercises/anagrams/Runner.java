package com.qa.exercises.anagrams;

import java.util.Arrays;

public class Runner {

	public static void main(String[] args) {
		System.out.println(
				"Are the words 'devil' and 'angel' anagrams of each other? " + Anagrams("angel", "devil"));
		System.out.println("Are the words 'computer' and 'Toc Um Pre' anagrams of each other? "
				+ Anagrams("computer", "tocumpre"));
	}

	static boolean Anagrams(String a, String b) {
		
		Arrays.asList(a.split(""));
		Arrays.asList(b.split(""));
		char[] aSort = a.toLowerCase().toCharArray();
		char[] bSort = b.toLowerCase().toCharArray();
		Arrays.sort(aSort);
		Arrays.sort(bSort);
		return Arrays.equals(aSort,bSort);
	}

}
