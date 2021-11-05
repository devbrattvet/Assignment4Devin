package assignment4;

public class BankAccount {
	private String name;
	private String accountNum;
	private double balance;
	
	public BankAccount()
	{
		balance=0;
	}
	
	public double getBalance()
	{
		return this.balance;
	}
	
	public void setAccountNum(String accountNum)
	{
		this.accountNum=accountNum;
	}
	
	public String getAccountNum()
	{
		return this.accountNum;
	}
	
	public void setAccountName(String name)
	{
		this.name=name;
	}
	
	public String getAccountName()
	{
		return this.name;
	}
	
	public void deposit(double amount)
	{
		balance=balance+amount;
	}
	
	public void withdraw(double amount)
	{
		balance=balance-amount;
	}
	
	public BankAccount(String name, double balance, String accountNum)
	{
		this.balance=balance;
		this.name=name;
		this.accountNum=accountNum;
		
	}
	
	public String toString()
	{
		return "Name: "+this.name+"\n"+"Account Number: "+this.accountNum+"\n"+"Balance: $"+String.format("%.2f",this.balance)+"\n";
	}
	
}
