package exceptionhandling;


public class MultipleCatchBlocks {

	public static void main(String[] args) {

		try {
			int b[]=null;
			b[2]=2;
			int a[]=new int[6];
			a[4]=8;
			int i = 7;
			int j = 2;
			int k = i / j;
			System.out.println(" output is " + k);

		} catch (ArithmeticException e) {
			System.out.println(" can not divide by Zero  ");
		}catch (ArrayIndexOutOfBoundsException a){
			System.out.println("stay in your limit ..");
		} catch (Exception e){
			System.out.println("something wrong ");
		}finally {   // finally block executes in any situation (in exception or if there is no any exception then also finally block execute)
			System.out.println("Bye ");
		}
	}
}
