// 8 primitive data types in java and for all primitive data type there is a wrapper class
// 8 primitive data types - char , byte, short , int , long, float , double , boolean
public class WrapperClassDemo {
	public static void main(String[] args) {

        int i = 5;// primitive data type int
		Integer ii= new Integer(7); //wrapper class Integer

		Integer in= new Integer(i); //Boxing or Wrapping (putting primitive variable inside object)

		int j = ii.intValue(); // fetching the value from object is UnBoxing  or UnWrapping

		Integer value= i; // AutoBoxing or AutoWrapping (it automatically put primitive variable inside object)

		int k = value; // autoUnBoxing AutoUnWrapping (automatically fetch value from object)

		String str ="123";
		int n = Integer.parseInt(str);

		System.out.println(n);
	}
}
