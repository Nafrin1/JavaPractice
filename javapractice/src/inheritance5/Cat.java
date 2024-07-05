package inheritance5;

public class Cat extends Animal{
	@Override
	public void makeSound()
	{
		super.makeSound();
		System.out.println("Cat says meow");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat call=new Cat();
		call.makeSound();
//To call animal class in main create a separate object and then call the method
	}

}
