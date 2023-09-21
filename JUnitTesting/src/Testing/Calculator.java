package Testing;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("starting Calculator");
		run();		
		
	}

	public static void run() {
		// this is the method that I will use to 
		// run my Method Choreography 	
		DoArithmetic a = new DoArithmetic();
		double result = a.Divide(2, 2);
		
		System.out.println(result);

	}
	
}