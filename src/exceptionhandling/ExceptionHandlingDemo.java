package exceptionhandling;

// dont repeat code (redundancy) , redundancy is crime in java
public class ExceptionHandlingDemo {

	public static void main(String[] args) {

		try {
			int i = 7;
			int j = 2;
			int k = i / j;
			System.out.println(" output is " + k);

		} catch (ArithmeticException e) {

			System.out.println(" Error ");
		} finally {   // finally block executes in any situation (in exception or if there is no any exception then also finally block execute)
			System.out.println("Bye ");
		}

	}
}
