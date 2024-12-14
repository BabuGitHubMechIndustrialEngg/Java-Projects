package com.lambda;

public class CalculatorImpl {

	public static void main(String[] args) {
		/* Traditional approach using anonymous class*/
		Calculator calculator = new Calculator() {
			
			@Override
			public void switchOn() {
				System.out.println("Swithcing on the calculator");
			}
		};
		
		calculator.switchOn();
		
		// Using lambda
		Calculator calculator2 = () -> {System.out.println("Swithcing on Calculator 2");};
		calculator2.switchOn();
		
		Calculator calculator3 = () -> System.out.println("Switching on Calculator 3");
		calculator3.switchOn();
	}

}
