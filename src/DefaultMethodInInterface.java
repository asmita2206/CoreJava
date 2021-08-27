// Abstract class -> Define and Declare method
//interface -> only declare method (till java 1.7)
// in java 1.8 we can define meethods in interface

@java.lang.FunctionalInterface // this is a functional interface becz it has only one abstract method , and we can have multiple default methods.
interface DemoInterface{

	void abc();
	default void show(){ // we can define method in interface with "default" keyword from java 1.8
		System.out.println(" in default method from java 1.8");
	}
}

class DemoImp implements DemoInterface{
	public void abc(){
		System.out.println(" in abc");
	}

	/*public void show(){
		System.out.println(" in show");
	}*/
}
public class DefaultMethodInInterface {

	public static void main(String[] args) {

		DemoInterface obj= new DemoImp();
		obj.abc();
		obj.show();
	}
}
