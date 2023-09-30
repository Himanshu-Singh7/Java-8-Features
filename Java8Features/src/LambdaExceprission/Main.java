package LambdaExceprission;

public class Main {
	
	public static void main(String[] args) {
		
		Employee employee = ()-> "Software enginner";
		System.out.println(employee.getname());
		
	}

}
