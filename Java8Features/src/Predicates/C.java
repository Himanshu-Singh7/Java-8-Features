package Predicates;

import java.util.function.Predicate;

public class C {
	

	public static void main(String[] args) {
		
		
		Predicate<String>  startWithLetterH = x -> x.toLowerCase().charAt(0) == 'h';
		Predicate<String>  endWithLetterU = x -> x.toLowerCase().charAt(x.length() -1) == 'u';
		Predicate<String> and = startWithLetterH.and(endWithLetterU);  // Both condition  are satisfied
		Predicate<String> or = startWithLetterH.or(endWithLetterU);    // one condition are satisfied
		
		
		System.out.println(and.test("Himanshu"));
		System.out.println(or.test("Himanshu"));
		System.out.println(startWithLetterH.negate().test("Himanshu"));  // Negate meanns it not allowed in this Section
		
		//Is Equal
		Student s1 =  new Student("Himanshu", 1);
		Student s2 =  new Student("Ram", 2);
		Predicate<Student> studentpredicate  = x -> x.getId() > 1;
		System.out.println(studentpredicate.test(s2));
		
		Predicate<Object> obj  = Predicate.isEqual("Himanshu");
		System.out.println("Object : " +obj.test("Himanshu"));
		
		
	}
	
	private static class Student {
		String name;
		int id;
		public Student(String name, int id) {
			super();
			this.name = name;
			this.id = id;
		}
		
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		
	}

}
