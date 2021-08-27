//types of interface
// 1. Normal - interface which have more than one method
// 2. Single abstract method - which have only one method( from java 8 it is called functional interface - lambda Expression)
// 3. Marker interface - doesnt have any method , empty interface ex: Serializable

interface FunctionalInterface{ // interface have only one abstract method

	void show();
}
public class TypesOfInterface {

	public static void main(String[] args) {
		FunctionalInterface fi= () -> System.out.println(" Lambda expression"); //  this is lambda expression
		fi.show();
	}
}
