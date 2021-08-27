// super()
class A{
	public A(){
		System.out.println("in A");
	}

	public A(int i){
		System.out.println("in A int");
	}
}
class B extends A{
	public B(){
		System.out.println("in B");
	}
	public B(int i){
		System.out.println("in B int");
	}

	public B(int i, int j){
		super(i);
		System.out.println("in B int int");
	}
}
public class SuperDemo {
	public static void main(String[] args) {

		B b=new B();// whenever create obj of sub class,it calls the constructor of super class and sub class both
	B b1=new B(5);// it also calls the default constructor of super class by default and parameterized constructor of sub class
	B b2=new B(2,3);// it calls super(i) parameterized const of super class becz of super() method
	}
}
