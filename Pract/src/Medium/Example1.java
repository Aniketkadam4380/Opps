package Medium;

public class Example1 {

	public static void main(String[]args) {
		int a=10;
		int b=677;
		int c=add(a,b);
		System.out.println("Addition of a & b is :"+c);
	
	}
	public static int add(int n1,int n2) {
		int res;
		res=n1+n2;
		return res;
		
	}


}
// so here we created return type method called add with two parameters 
// and they returning the value res so when we call add(parameters ) in main method it shows result


