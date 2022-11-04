package Medium;
//here we creating object  of Rectangle class, and initializing value by invoking input method and displaying value by invoking calculate method
class Rectangle{
	int length;
	int width;
void input(int l,int w) {
	length=l;
	width=w;
}
void calculate() {
	System.out.println("Area of Reactangle:"+length*width);
}
}
public class TestRect {
	public static void main(String[]args) {
		Rectangle re=new Rectangle();
		Rectangle re1=new Rectangle();
// we can also create two abject like this:- Rectangle re=new Rectangle(),re1=new Rectangle();
		re.input(10,24);
		re1.input(25,34);
		re.calculate();
		re1.calculate();
		
	}
}
