package Medium;
//We can have multiple classes in different Java files or single Java file. If you define multiple classes in a single Java source file, 
//it is a good idea to save the file name with the class name which has main() method.
 class Stud {
	int id;
	String name;
	
}
// here we initialize the object through reference variables 
//initializing object means Storing the data into the object 
public class Student2{
	public static void main(String[]args) {
		Stud se2=new Stud();
		se2.id=100;
		se2.name="Anikrttefh";
		
		System.out.println(se2.id);
		System.out.println(se2.name);
		
	}

}

