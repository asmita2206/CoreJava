abstract class Writer{

	public abstract void write();
	public void show(){
		System.out.println("in show");
	}
}
class Pen extends Writer{

	public void write() {
		System.out.println("write in pen");
	}
}
class Pencil extends Writer{

	public void write() {
		System.out.println("write in pencil");
	}
}

public class NeedOfAbstractClass {

	public static void main(String[] args) {

		Writer wtr= new Pen();
		Pen pen=new Pen();
		pen.write();
		pen.show();
		Writer wtr1= new Pencil();
		wtr.write();
		wtr.show();
		wtr1.write();
		wtr1.show();
	}
}
