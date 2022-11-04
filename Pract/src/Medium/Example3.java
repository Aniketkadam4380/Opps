package Medium;

 class Exam {

	private String color;
	private String shape;
	private int number;
	
	public int getNumber() {
		return number;
	}
	public String getColor() {
		return color;
	}
	public String getShape() {
		return shape;
	}
	public void setNumber(int n) {
		this.number=n;
	}
	public void setColor(String c) {
		this.color=c;
	}
	public void setShape(String s) {
		this.shape=s;
	
	}
}
	public  class Example3{
		public static void main(String args[]) {
			Exam ex3=new Exam();
			ex3.setColor("pink");
			ex3.setShape("circle");
			ex3.setNumber(30);
			System.out.println("Number:"+ex3.getNumber());
			System.out.println("Shape:"+ex3.getShape());
			System.out.println("Color:"+ex3.getColor());
		}
		}
	