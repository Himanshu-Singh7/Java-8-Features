package AnonymousInnerClass;

public class Main {
	
	public static void main(String[] args) {
		Employee employee = new Employee() {

			@Override
			public String getSalry() {
				// TODO Auto-generated method stub
				return "100";
			}

			@Override
			public String getDesination() {
				// TODO Auto-generated method stub
				return "Software enginner";
			}
			
		};
		
		System.out.println(employee.getSalry());
	}

}
