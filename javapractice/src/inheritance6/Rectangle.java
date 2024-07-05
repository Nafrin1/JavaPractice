package inheritance6;

public class Rectangle extends Shape {
	
	int a,b;
	
	public Rectangle(int a,int b)
	{
		this.a=a;
		this.b=b;                       //Or simply give inside method
	}
	
	
	public void getArea()
	{
		
		super.getArea();
	
		int area=a*b;
		System.out.println("The area of rectangle is: "+area);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect=new Rectangle(10,24);
		rect.getArea();

	}

}
