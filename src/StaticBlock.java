
class Emp{
	int eid;
	int salary;
	static String ceo;

	// static block will execute only once. it doesnt matter how many objects you create
	//if you want to initialize a static variable we can use a static block.
	//static block will be executed when you load a class(class will load only once)
	//static block will be executed before the constructor becz class load first then only you create the object
	static {
		ceo="Larry";
		System.out.println("in static");
	}
	public Emp(){ // to initialize non-static variables use constructor
		eid=1;           //constructor will execute when you create an object
		salary=3000;
		System.out.println("in constructor");
	}

	public void show(){
		System.out.println("eid =" +eid+ "salary =" +salary +"ceo ="+ceo);
	}
}
public class StaticBlock {

	public static void main(String[] args) {

		Emp asmita=new Emp();
        Emp ashish=new Emp();

        asmita.show();
        ashish.show();
	}
}
