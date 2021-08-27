
interface StaticDemo{

	int num =8 ; // whenever you create variable inside a interface ,1. you need to declare with initialization and 2. by default it becomes a constant
	void abc();
	static void show(){ // static method in interface from java 1.8
		System.out.println(" static method in interface from java 1.8");
	}
}

class StaticImp implements StaticDemo{

	public void abc(){
	//	num=7; // by default num is constant becz it is declared in interface hence we can not change value of num
	}
}
public class StaticMethodInInterface {

	public static void main(String[] args) {

		StaticDemo.show(); // dont need to call object for static methods
	}
}
