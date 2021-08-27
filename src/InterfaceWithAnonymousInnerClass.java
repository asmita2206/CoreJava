
interface Inface{

	void show();
}

public class InterfaceWithAnonymousInnerClass {

	public static void main(String[] args) {

		// you can create the object of interface using the anonymous class.
		Inface a = new Inface() {

			public void show() {
				System.out.println("anything");
			}
		};
		a.show();
	}
}
