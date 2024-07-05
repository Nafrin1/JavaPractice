package inheritance4;

import java.util.Scanner;

public class Parent {
	
	String name;
	int age;
	int rand;
	
	public void display()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the name");
		name=scan.nextLine();
		System.out.println("Enter the age");
		age=scan.nextInt();
		System.out.println("Enter another number");
		rand=scan.nextInt();
		
	}

}
