package staticKeyword;

public class MyClass implements A{
	
	public static void main(String[] args) {
		MyClass obj = new MyClass();
		
		//obj.sayHello();
		//MyClass.sayHello();
		obj.sayBye();
		A.sayHello();
		
	}

}
