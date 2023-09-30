package Function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {
	
	public static void main(String[] args) {
		Function<String,Integer> function1 =  x -> x.length();
		Function<String,String> function2 =  s -> s.substring(0,3);
		Function<List<Student>,List<Student> > studentWithvipsprifix = li -> {
		List<Student> result = new ArrayList<>();	
			for(Student s :li) {
				if(function2.apply(s.getName()).equalsIgnoreCase("vip")) {
					result.add(s);
					
				}
			}
			
			return result;
			
		};
		
		Student s1 = new Student(1, "vipul");
		Student s2 = new Student(1, "vipulav");
		Student s3 = new Student(1, "Arav");
		List<Student> students = Arrays.asList(s1,s2,s3);
		List<Student> filtredstudent = studentWithvipsprifix.apply(students);
		System.out.println(filtredstudent);
		
	}
	
	private static class Student {
		private int id;
		private String name;
		
		public Student(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}

		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + "]";
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
	}

}
