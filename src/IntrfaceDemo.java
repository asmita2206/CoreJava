// one class extends two class is multiple inheritance and java does not support multiple inheritance
// so if you need to extends more than one class then use interface
// interface is same as abstract class but the difference is abstract class have abstract method as well as normal methods, but in interface all the methods are abstract
// by default interface have all the public abstract methods, so you dont need to write keyword public abstract with method
// we can not create object of interface but we can create reference of interface.
// we can implement multiple interfaces but we can not extends multiple classes.
interface Wrriter{

     void write();
}

class abc{
	public void show(){
		System.out.println(" in abc");
	}
}
class peen extends abc implements Wrriter{

	public void write(){
		System.out.println(" in pen");
	}
}

class peencil implements Wrriter{

	public void write(){
		System.out.println(" in pencil");
	}
}

class kit{
	public void doSomething(Wrriter w){
		w.write();
	}
}
public class IntrfaceDemo {

	public static void main(String[] args) {

		kit k=new kit();
		Wrriter p=new peen();
		Wrriter pc=new peencil();
		k.doSomething(p);
		k.doSomething(pc);
	}
}
