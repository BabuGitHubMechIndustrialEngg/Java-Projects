package function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Predefined Functional Interfaces
 * 
 */
public class FunctionDemo {

	public static void main(String[] args) {
		Function<Integer, String> function = new Function<Integer, String>() {

			@Override
			public String apply(Integer t) {
				
				return "Hi This is "+t;
			}
		};
		
		
		Function<Integer, Integer> function2 = (Integer a) ->  (2*a);
		List<Integer> list = Arrays.asList(1,2,3);
		Stream<Integer> stream = list.stream().map(function2);
		List<Integer> dList =  stream.collect(Collectors.toList());
		dList.forEach(n->System.out.println(n));
	}

}
