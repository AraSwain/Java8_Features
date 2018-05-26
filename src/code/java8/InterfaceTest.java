package code.java8;

public class InterfaceTest {
	
	public static void main(String[] args) {
		ITest.display();
		
		TestImpl obj = new TestImpl();
		obj.defaultDisplay();
	}

}
