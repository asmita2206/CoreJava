public class EnhancedForLoopWithArrays {
	public static void main(String[] args) {

		int a[]={1,2,3,4};

		int b[][]={
				a,
				{2,5,6,7}
		};

		for (int k :a ){ // enhanced for loop or for each loop
			System.out.print(" "+k);
		}
		System.out.println();

		for (int k[] :b){
			for (int l : k){
				System.out.print(" "+l);
			}
			System.out.println();
		}
	}
}
