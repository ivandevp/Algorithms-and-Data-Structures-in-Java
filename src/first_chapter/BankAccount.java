package first_chapter;

public class BankAccount {

	private double balance; // account balance
	
	public BankAccount(double openingBalance) // constructor
	{
		this.balance = openingBalance;
	}
	
	public void deposit(double amount) // makes deposit
	{
		balance = balance + amount;
	}
	
	public void withdraw(double amount) // makes withdrawal
	{
		balance = balance - amount;
	}
	
	public void display() // display balance
	{
		System.out.println("Balance = " + balance);
	}
	
} // End class BankAccount
