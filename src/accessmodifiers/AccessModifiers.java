package accessmodifiers;
// public, private, protected, default
/*
* private -> access from specific class
* default -> access from specific package
* public -> access from any class or package
* protected -> access from subsiding class
* */

class Student{

	int rollNo; // this will access from any class of same package
	private String name; // this will access from this class only
	protected int marks; // this will access from this class and its child class of any package
	public int age; // this will access from any class and from any package
}
public class AccessModifiers {

	public static void main(String[] args) {

		Student student=new Student();
		student.marks=100;
		student.rollNo=1;
		student.age=20;

	}
}
