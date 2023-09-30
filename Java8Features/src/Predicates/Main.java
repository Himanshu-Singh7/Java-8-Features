package Predicates;
import java.util.*;
import java.util.function.Predicate;


public class Main {
	
	public static void main(String[] args) {
		Predicate<Integer> isEven =  x -> x % 2 == 0 ;
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		for(Integer i : list) {
			if(isEven.test(i)) {
				System.out.println(i);
			}
		}
	}

}
