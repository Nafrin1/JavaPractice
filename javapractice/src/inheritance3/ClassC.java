package inheritance3;

public class ClassC implements ClassA, ClassB {
	
	public void add()
	{
		int sum=a+b;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassC show=new ClassC();
		show.add();
		
		System.out.println(show.a);

	}

}
