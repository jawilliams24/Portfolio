package com.qa.exercises.anagrams;

import java.util.Arrays;

public class Runner {

	public static void main(String[] args) {
		System.out.println(
				"Do the words 'devil' and 'angel' contain all the same characters? " + Anagrams("angel", "devil"));
		System.out.println("Do the words 'computer' and 'potato' contain all the same characters? "
				+ Anagrams("computer", "potato"));
	}

	static boolean Anagrams(String a, String b) {

		char[] aSort = a.toCharArray();
		char[] bSort = b.toCharArray();
		Arrays.sort(aSort);
		Arrays.sort(bSort);
		return aSort.equals(bSort);
	}

}
