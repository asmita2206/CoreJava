//multiple inheritance is not supported in java due to ambiguity of calling same method from two parent classes
class AA{
	public void show(){
		System.out.println("in AA");
	}
}

class BB{
	public void show(){
		System.out.println("in BB");
	}
}

/*class CC extends AA,BB{ // here from which class c.show method will be called ? that gives Ambiguity hence multiple classes can not extends and multiple inheritance is not supported in java

}*/
public class MultipleInheritanceAmbiguity {
	public static void main(String[] args) {
/*
		CC c=new CC();
		c.show();*/
	}
}
