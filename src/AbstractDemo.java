
// if a class is abstract class then it is not compulsary to have a abstract method in that class, but if your class have a abstract method then that class is compulsary to become a abstract class.
abstract class Human{ // no one can create object of abstract class, can not instantiate it, but you can create reference of that class

	public abstract void eat(); // whenever have a abstract method in your class then that class should be abstract class.
	public void walk(){

	}
}

class Man extends Human{   // Man is concrete class

	public void eat() { // if extended class Human have abstract method then it is compulsary to define that method

	}
}

public class AbstractDemo {

	public static void main(String[] args) {

		Human ref= new Man();


	}
}
