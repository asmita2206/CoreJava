class Employee {

	int eid;
	int salary;
//	static variables are those variables which are same for all the objects.
// static is same for all the objects hence it is not compulsary to use an object with static variable, we can also use the class name.
	static String ceo;

	public void show() {
		System.out.println("eid =" + eid + ":" + "salary =" + salary + ":" + "ceo =" + ceo);
	}
}

public class StaticKeywordDemo {
  int i=0;
	public static void main(String[] args) {

	//	i=9;    can not access a non-static variable inside a static block or static method
		Employee asmita = new Employee();
		asmita.eid = 1;
		asmita.salary = 10000;
    	asmita.ceo = "Vishwajit"; // OR
		Employee.ceo="Vishwajit"; // we dont need object, hence class name is prefered most with static

		Employee ashish = new Employee();
		ashish.eid = 2;
		ashish.salary = 30000;
		ashish.ceo = "Shree"; // OR
		Employee.ceo="Shree";

		ashish.ceo="Mayur"; // OR
		Employee.ceo="Mayur";
		asmita.show();
		ashish.show();

	}
}
