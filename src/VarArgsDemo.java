class Calc {
	public int add(int... n) { // {4,5,6,7,8,9,2}  // Variable length Arguments
		int sum = 0;
		for (int i : n) {
			sum = sum + i;
		}
		return sum;
	}
}
public class VarArgsDemo {
	public static void main(String[] args) {

		Calc obj=new Calc();
		System.out.println(obj.add(4,5,6,7,8,9,2)); // pass multiple arguments it will become an array
	}
}
