package staticKeyword;

public interface A {
	
	static void sayHello() {
		System.out.println("hello");
	}
	
	default void sayBye() {
		System.out.println("bye");
	}

}
