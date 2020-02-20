package com.qa.exercises.fibonacci;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		System.out.println("What is the 6th number in the fibonacci sequence?" + fibonacci(6));
		System.out.println("What is the 24th number in the fibonacci sequence?" + fibonacci(24));
	}

	static int fibonacci(int pos) {
		List<Integer> nums = new ArrayList();
		nums.add(0);
		nums.add(1);
		for (int i = 1; i <= (pos + 1); i++) {
			nums.add(nums.get(i) + nums.get(i - 1));
		}
		return nums.get(pos);
	}

}
