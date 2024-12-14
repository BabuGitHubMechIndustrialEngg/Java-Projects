package consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*
 * Predefined Functional Interfaces
 * Consumer can be used in all context where object needs to be consumed 
 * i.e object taken as input and some operations to be performed on the object 
 * and will not return anything 
 * 
 * 
 * Abstract method in consumer is ---> public abstract void accept(T t);
 * @param t is the input argument
 * 
 */
public class ConsumerDemo {

	
	public static void main(String[] args) {
		Consumer<String> consumer1 = (t) -> System.out.println("Printing -->"+t);
		consumer1.accept("Test Soft");
		
		Consumer<Integer> consumer2 = (t) -> System.out.print(" "+t);
		List<Integer> marks = Arrays.asList(55,45,65,75,85,100);
		marks.forEach(consumer2);
		
	}

}
