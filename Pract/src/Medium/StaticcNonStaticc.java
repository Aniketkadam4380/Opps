package Medium;

public class StaticcNonStaticc {
	public static void main(String[]args) {
		one(); // here as we can see we don't need to create object for static method to call 
		two();
		StaticcNonStaticc ob=new StaticcNonStaticc();// object creation for calling non static method 
		ob.three();
		
	}
	static void one() {
		System.out.println("this is one; static method working");
	}
	static void two() {
		System.out.println("this is two;static method is working");
	}
	void three() {
		System.out.println("this is three; non static method is working ");
	}

}

