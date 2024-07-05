package getdetails;

public class GetDetails1 {
	
	String name;
	int age;
	double height;
	
	public void show()								//Method to print the values. If return type is used, then use return and sysout in main method
	{
		System.out.println("name: "+name);
		System.out.println("age: "+age);
		System.out.println("height: "+height);
	
	}
	
	public GetDetails1(String name, int age, double height)   //To access the static variable
	{
		this.name=name;                     //Can also be given as this.name=x; OR name=x;
		this.age=age;  						//Can also be given as this.age=y; OR age=y;
		this.height=height;					//Can also be given as this.height=z; OR height=z;
		
	}

	public static void main(String[] args) {         //Main method can be given in another class as well
		// TODO Auto-generated method stub
		
		GetDetails1 person1=new GetDetails1("Poppy",20,89.7);
		person1.show();					//It gives all the statments within that method together 
		
		GetDetails1 person2=new GetDetails1("bloop",20,89.7);
		System.out.println("name: "+person2.name);   //Gives only what is required from that same method that contains other statemtnts instead of the whole.
		
		//METHOD1:  PRINT STATEMNT NOT IN MAIN METHOD. BUT PRINTIN STATEMNT CAN BE USED IN MAIN TO RETURN SINGULAR VALUES ONLY

	}

}
