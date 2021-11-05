package assignment4;

public class CheckingAccount extends BankAccount {
	
	CheckingAccount(String name, double balance, String accountNum){
		super(name,balance,accountNum);
	}
	
	void MonthEnd(double averageDailyBalance)
	{
		if(getBalance()<1500) {
			withdraw(20);
		}
	}
}
