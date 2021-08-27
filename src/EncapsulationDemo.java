// Encapsulation is binding data with methods
class Candidate{

	private int rollNo; // encapsulation binding rollNo with method and does not use this variable outside the class directly by making it private , it will be accessed only with methods.
	String name;

	// getters and setters to access variables
	public void setRollNo(int r){
		rollNo=r;
	}
	public int getRollNo(){
		return rollNo;
	}

}

public class EncapsulationDemo {

	public static void main(String[] args) {

		Candidate c1= new Candidate();
		c1.setRollNo(2);
		c1.name="Asmita";// not encapsulation
		System.out.println(c1.getRollNo());
	}
}
