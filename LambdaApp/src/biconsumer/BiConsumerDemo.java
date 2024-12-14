package biconsumer;

import java.util.function.BiConsumer;
/*
 * Predefined Functional Interfaces
 * 
 */
public class BiConsumerDemo {

	public static void main(String[] args) {
		BiConsumer<Integer, Integer> biConsumer = new BiConsumer<Integer, Integer>() {

			@Override
			public void accept(Integer t, Integer u) {
				System.out.println("BiConsumer "+t+" "+u);
			}
			
		};
		
		
		int a = 10;
		int b = 20;
		biConsumer.accept(a, b);
		
	}

}
