package com.qa.exercises.uniqueletters;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Runner {

	public static void main(String[] args) {
		System.out.println("What are the unique letters from the string 'sentence'? " + uniqueLetters("sentence"));
		System.out.println(
				"What are the unique letters from the string 'Hello all of you'? " + uniqueLetters("Hello all of you"));
	}

	public static String uniqueLetters(String sentence) {

		return Arrays.asList(sentence.split(""))
				.stream()
				.distinct()
				.collect(Collectors.joining(""));

	}

}
