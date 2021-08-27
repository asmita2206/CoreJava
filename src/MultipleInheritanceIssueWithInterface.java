interface DemoMI{

	void abc();
	default void show(){
		System.out.println(" in DemoMi show");
	}
}

interface MyDemo{
	default void show(){
		System.out.println(" in MyDemo show");
	}
}

class MIDemo implements DemoMI ,MyDemo{

	public void abc(){
		System.out.println(" in abc");
	}

	@Override     // to avoid Multiple inheritance by interface override the method using interface name with super keyword and the method name in java 1.8
	public void show() {
		MyDemo.super.show();
	}                                           // OR

	/*public void show(){              //  create new method
		System.out.println(" in MIDemo show");
	}*/
}
public class MultipleInheritanceIssueWithInterface {

	public static void main(String[] args) {

		DemoMI demo=new MIDemo();
		demo.show();
	}
}
