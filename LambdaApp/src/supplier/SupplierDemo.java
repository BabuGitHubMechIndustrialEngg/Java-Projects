package supplier;

import java.util.function.Supplier;

/*
 * Predefined Functional Interfaces
 * Supplier does not take input, returns the result
 * 
 */
public class SupplierDemo {

	public static void main(String[] args) {
		Supplier<String> supplier = new Supplier<String>() {

			@Override
			public String get() {
				
				return "Hi Welcome to Java 8";
			}
		};
		
		
		System.out.println(supplier.get());
		
		Supplier<String> supplier2 = ()-> "Hello Welcome to Java 8 Lambda Expressions";
		
		System.out.println(supplier2.get());
	}

}
