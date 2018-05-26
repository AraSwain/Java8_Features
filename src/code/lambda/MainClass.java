package code.lambda;

public class MainClass {
	public static void main(String[] args) {

		// Shape triangle = () -> System.out.println("Drawing a Triangle");
		// Shape rectangle = () -> System.out.println("Drawing a Rectangle");

		// rectangle.draw();
		// triangle.draw();
		
		ITestLambda obj = (int a, int b) -> { return a+b; }; 
		
		int sum = obj.sum(1, 2);
		System.out.println(sum);
		
		
	}
}
