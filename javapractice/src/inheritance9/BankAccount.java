package inheritance9;

public class BankAccount {
	
	int amount=0;
	int balance=0;
	
	
	public void deposit(int amount)
	{
		balance=amount+balance;
		System.out.println("Cash deposited. Balance: "+balance);
	}
	
	public void withdraw(int withdraw)
	{
		balance=balance-withdraw;
		System.out.println("Cash withdrawn. Balance: "+balance);
	}

}
