package Predicates;

import java.util.function.Predicate;

public class A {
	
	public static void main(String[] args) {
		Predicate<Integer> salaryGreaterThanOneLac = X -> X >= 100000;
		System.out.println(salaryGreaterThanOneLac.test(1000000000));
			
	
		
	}

}
