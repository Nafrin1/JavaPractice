package inheritance4;

public class Child extends Parent{
	
	
	public void print()
	{
		
		System.out.println("Hello"+name);
		System.out.println("You are"+age+"years old");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child child=new Child();
		child.display();
		child.print();
		
		System.out.println("The number you have picked is"+child.rand);

	}

}
