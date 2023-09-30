package Predicates;
import java.util.function.Predicate;
public class B {
	public static void main(String[] args) {
		
		Predicate<String> startWithLetterV = x -> x.toLowerCase().charAt(0) == 'v';
		
		System.out.println(startWithLetterV.test("vikash"));
		
	}

}
