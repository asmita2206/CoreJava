class Ab{

	final int DAY; // can not change value of final variable it will become constant
	public Ab(){
		DAY=10;
	//	DAY=12; // giving error becx we can not change value of final variable.
	}

	final public void show(){
		System.out.println(" in Ab");
	}
}

final class Bfinal{ // if you make a class as final class  then no other class can extends this class , can not inherite it

	public void b(){
		System.out.println("Hi");
	}
}

class c extends Ab{

/*	public void show(){        // can not override this method becz this method is final in Ab class
		System.out.println(" in c");
	}*/

}
public class FinalKeywordDemo {

	public static void main(String[] args) {
		Ab ab= new Ab();
		ab= new c();
		c c=new c();
		c.show();
		ab.show();
		//System.out.println(ab.DAY);
	}
}
