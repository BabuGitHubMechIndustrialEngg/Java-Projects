package predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Predicate is Functional Interface. It is used for conditional check
 */
public class PredicateDemo {

	public static void main(String[] args) {
		int num = 25;
		Predicate<Integer> predicateObj = new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				if(t%2==0)
					return true;
				return false;
			}
			
			
		};
		
		System.out.println(num+" is even "+predicateObj.test(num));
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
		Stream<Integer> evenStream = list.stream().filter((t) -> (t%2==0));
		List<Integer> evenList = evenStream.collect(Collectors.toList());
		System.out.println("EvenList="+evenList);
	}

}
