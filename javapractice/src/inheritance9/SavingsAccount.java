package inheritance9;

public class SavingsAccount extends BankAccount {
	
	public void withdraw(int withdraw)
	{
		if(balance>100)
		{
			balance=balance-withdraw;
			System.out.println("Cash withdrawn. Balance: "+balance);
		}
		else
		{
			
			System.out.println("Insufficient balance");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount bank=new BankAccount();
		bank.deposit(8000);
		bank.withdraw(500);
		
		SavingsAccount save=new SavingsAccount();
		save.withdraw(200);

	}

}
