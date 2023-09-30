package DefaultKeyword;

public interface Parent {
   
	default void sayHello() {
    	
		System.out.println("Hello");
    }
}
