
/*
* Inheritance has two types of relationship
* 1.IS-A
* 2.HAS-A
* A class which extends another class it is called IS-A type relationship
* And a class in which you are creating the object of another class it is called HAS-A type relationship
* */
class Calculator { // Super class(in java), Parent (in oops),Base(in c++)

	public int add(int i, int j) {
		return i + j;
	}
}

class CalcAdv extends Calculator {   //Sub class(in java), Child(in oops), Derived(in c++)

	public int sub(int i, int j) {
		return i - j;
	}
}
class CalcVeryAdv extends CalcAdv{

	public int multi(int i, int j){
		return i*j;
	}
}
public class InheritanceDemo {

	public static void main(String[] args) {

		CalcVeryAdv c1 = new CalcVeryAdv();
		int result1 = c1.add(4, 5);
		int result2 = c1.sub(9, 5);
		int result3= c1.multi(4,5);

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}
}
