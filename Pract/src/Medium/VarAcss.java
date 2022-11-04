package Medium;

public class VarAcss {
	static int i=33;
	int j=43;
	public static void main(String[]args) {
		VarAcss v=new VarAcss();
		onee();
		v.teww();
	}
	static void onee() {
		double d=76789.89;
		System.out.println("Static variable:"+i);
		System.out.println("Local variable;"+d);
		System.out.println("**********************");
	}
	void teww() {
		float f=89.44f;
		System.out.println("Static variable:"+i);
		System.out.println("Instance or Global variable:"+j);
		System.out.println("Local variable;"+f);
	}

}
// here we can see that static method can only access the local and static variables but non static can access any variable

