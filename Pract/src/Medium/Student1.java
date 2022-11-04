package Medium;

public class Student1 {
	// simple example of class and object  
	// here we created a class of name student 
	int id=10;                  // here we created two variables 
	String name="Aniket";
	public static void main(String[]args) {
		// we create a object to access the global variables 
	    // Syntax Class name object name = new class name() 
		// new keyword is used to allocate memory at runtime 
		Student1 st=new Student1();  // ..... object creation 
		System.out.println(st.id);
		System.out.println(st.name);
		
		
		
	}
}