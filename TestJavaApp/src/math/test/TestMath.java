package math.test;

public class TestMath {

	public static void main(String[] args) {
		MathOperation add = (a, b)-> a+b;
		MathOperation sub = (a, b)-> a-b;
		MathOperation mul = (a, b)-> a*b;
		MathOperation div = (a, b)-> a/b;
		System.out.println("5+2="+add.operation(5, 2));
		System.out.println("5-2="+sub.operation(5, 2));
		System.out.println("5*2="+mul.operation(5, 2));
		System.out.println("5/2="+div.operation(5, 2));
	}

}
