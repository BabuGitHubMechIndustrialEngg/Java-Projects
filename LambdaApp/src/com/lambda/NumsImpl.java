package com.lambda;

public class NumsImpl {

	public static void main(String[] args) {
		Nums nums = (int x, int y) -> { System.out.println("Sum="+(x+y));};
		nums.add(10,20);
		Nums nums1 = (x,y) -> System.out.println("Sum="+(x+y));
		nums1.add(20, 30);
	}

}
