package com.lambda;

public class NumbersImpl {
	public static void main(String[] args) {
		Numbers numbers = (x, y) -> (x+y);
		System.out.println("Sum="+numbers.add(50, 60));
	}
}
