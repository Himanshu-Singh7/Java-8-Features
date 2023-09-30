package VariablesinLambdaExpression;

public class Main {
	
	
	private  void doSomething() {
	//	int a = 2;
		Employee employee = ()->{
			
		//	System.out.println(this.a);
			return "100";
		};
		
		System.out.println(employee.getSalary());
	}
	
	Employee employee1 = new Employee() {
		int x = 10;
		@Override
		public String getSalary() {
			System.out.println(this.x);
			
			return "100";
		}
	}; 
}
