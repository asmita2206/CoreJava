// child class method overrides the parent class method
class ADemo{

	public void show(){
		System.out.println(" in A");
	}
}
class BDemo extends ADemo{

	@Override // java gives the annotation @Override to avoid compile time mistake while overriding the method of super class
	public void show(){   // this method overrides the show method of class ADemo and this is method overriding
		System.out.println(" in B");
	}
}
public class MethodOverridingDemo {
	public static void main(String[] args) {

		BDemo b=new BDemo();
        b.show();
	}
}
