package code.java8;

public interface ITest {
	
	static void display() {
		System.out.println("Hello from Interface");
	}
	
	default void defaultDisplay() {
		System.out.println("Hello from default method of Interface");
	}

}
