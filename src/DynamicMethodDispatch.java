class Dynamic{

	public void show(){
		System.out.println("in dynamic");
	}
}

class Dyna extends Dynamic{

	public void show(){
		System.out.println("in dyna");
	}
}

class D extends Dynamic{
	public void show(){
		System.out.println("in D");
	}
}
public class DynamicMethodDispatch {

	// compile time and runtime polymorphism
	public static void main(String[] args) {
		// only call those methods which are present in reference class ie, Dynamic
		Dynamic obj= new Dyna(); // assigning the object to reference is at runtime hence it is  runtime polymorphism
		obj.show();// it will call show method of Dyna class and it will be decided at run time.

		obj=new D();// whenever you changing the object with same reference, then it will be calling method from that changed object
		obj.show(); //  is called dynamic method dispatch which changes the method everytime. And to achieve dynamic method dispatch we have to follow runtime polymorphism
	}
}
