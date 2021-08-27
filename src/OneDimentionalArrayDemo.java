/*
* Array :- 2 types
* 1. one dimentional array (1D array)
* 2. two dimentional array (2D array)
* 3. jagged array
* */

class Student{

	int rollNo;
	String name;
}
public class OneDimentionalArrayDemo {

	public static void main(String[] args) {

		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		Student s4=new Student();

		Student s[]=new Student[4];
		Student student[]={s1, s2, s3, s4};

		int num[]=new int[4]; // 1D Array
        int nums[]={8,12,76,56}; // 1D Array
		num[0]=8;
		num[1]=4;
		num[2]=7;
		num[3]=5;

		num[2]=99;
		System.out.println(num[2]);

		for (int i=0; i<4; i++){
			System.out.println(num[i]);
			System.out.println(nums[i]);
		}
	}
}
