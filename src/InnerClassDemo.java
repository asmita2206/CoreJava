/*
*  Inner class :- 3 basic types
* 1.Member class
* 2.static class
* 3.Annonymous class
*
*
* */

class Outer{

	int a; // member variable
	public void show(){  // member method

	}

	// inner class is needed only you have to use it in purpose of outer class
	class Inner{ // member class

		public void display(){
			System.out.println("in display");
		}
	}
	// as like static varible, static method, we also have static Inner class
	static class InnerStatic{ // static class

		public void display(){
			System.out.println("in static display");
		}
	}
}
public class InnerClassDemo {

	//class can have variables, methods, class

	public static void main(String[] args) {
		 Outer obj= new Outer();
		 obj.show();

		 //to use inner class you have to use (Outer.Inner) class
		//and only way to create the object of inner class is by using outer class object (obj.new Inner())
		 Outer.Inner innerObj= obj.new Inner();
		 innerObj.display();

		 Outer.InnerStatic innerStatic= new Outer.InnerStatic();
		 innerStatic.display();
	}
}
