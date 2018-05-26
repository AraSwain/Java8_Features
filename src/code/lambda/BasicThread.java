package code.lambda;

public class BasicThread {
	public static void main(String[] args) {
//		Runnable task1 = new Runnable() {
//
//			@Override
//			public void run() {
//				System.out.println("Running task1..");				
//			}
//			
//		};
		
		Thread t1 = new Thread(() -> System.out.println("Running task1.."));
		t1.start();
		
	}

}
	

