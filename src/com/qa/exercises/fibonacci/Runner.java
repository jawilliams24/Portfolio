package com.qa.exercises.fibonacci;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		System.out.println("What is the number at index 6 in the fibonacci sequence?\n" + fibonacci(6));
		System.out.println("What is the number at index 20 in the fibonacci sequence?\n" + fibonacci(20));
		System.out.println("Using the recursion method, what is the number at index 5?\n" + fibo(5));
	}

	static int fibonacci(int pos) {
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(0);
		nums.add(1);
		for (int i = 1; i < (pos+1); i++) {
			nums.add(nums.get(i) + nums.get(i - 1));
		}
		return nums.get(pos);
	}
	
	static int fibo(int num) {
		if(num==0) { return num;
		}
		else if(num==1) { return num;	
		}
		else return fibo(num-1)+fibo(num-2);
	}

	
	
}
