// if you have to create class only for one time use or only for overriding the method of other class then you can create the anonymous class
// Anonymous class doesnt have a name
class N{

	public void show(){
		System.out.println(" in N show");
	}
}
public class AnonymousInnerClassDemo {

	public static void main(String[] args) {

		N obj=new N(){  // In anonymous class we first create the object and then implement the anonymous class

			public void show(){
				System.out.println(" in Anonymous class");
			}
		};
		obj.show();
	}
}
