package Medium;
import java.util.Scanner;

public class Example2 {


	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number to find if its even or odd:");
		int i=sc.nextInt();
		findEvenOdd(i);
		sc.close();
		
	}
	public static void findEvenOdd(int i) {
		if (i%2==0) {
			System.out.println(i+":Is Even");
		}
		else {
			System.out.println(i+":Is Odd");
		}
		
	}
}
// here findEvenOdd method is static and parameterized  method 
// in main method at line 8 we enter the number after that at line 9 we call method then its controls directly goes to method body and it checks 


