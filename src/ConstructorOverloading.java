//constructor with different parameter is constructor overloading
class Demo {

	int num1;
	int num2;
	String operation;

	public Demo() {
		num1 = 0;
		num2 = 0;
		operation = "Nothing";
	}

	public Demo(int i) {

		num1 = i;
		num2 = 0;
		operation = "Nothing";
	}

	public Demo(int i, int j) {
		num1 = i;
		num2 = j;
		operation = "Nothing";
	}

	public Demo(int i, int j, String op) {
		num1 = i;
		num2 = j;
		operation = op;
	}
}

public class ConstructorOverloading {

	public static void main(String[] args) {

		Demo obj = new Demo();
		System.out.println(obj.num1+","+obj.num2+","+obj.operation);

	}
}
