package getdetails;

public class GetDetails2 {
	
	String name;
	int age;
	double height;
	
	public GetDetails2(String name, int age, double height)
	{
		this.name=name;
		this.age=age;
		this.height=height;
	}
	
	public String getName()     //separate methods to return each value due to difference in datatypes
	{
		return name;
		
	}
	
	public int getAge()
	{
		return age;
	}
	
	public double getHeight()
	{
		return height;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GetDetails2 person1=new GetDetails2("Kiki",2,30.4);
		System.out.println("name: "+person1.name);    //Return induvidual values from each method
		System.out.println("age: "+person1.age);
		System.out.println("height: "+person1.height);
		
		
		
		//METHOD2: PRINT STATEMTN INSIDE MAIN METHOD BUT RETURN INDUVIDUAL VALUES DUE TO DIFFERENT DATATYPES

	}

}
