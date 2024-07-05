package inheritance8;

public class HRManager extends Employee{
	
	public void work()
	{
		System.out.println("New work");
	}
	
	public void newEmployee()
	{
		System.out.println("Hello new employee");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		System.out.println(emp.salary);
		emp.work();
		HRManager manager=new HRManager();
		manager.work();

	}

}
