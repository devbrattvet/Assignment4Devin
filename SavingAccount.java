package assignment4;

public class SavingAccount extends BankAccount {
	double interestRate;
	
	SavingAccount(String name, double balance, String accountNum, double interestRate){
		super(name,balance,accountNum);
		this.interestRate=interestRate/100;
	}
	
	void MonthEnd(double averageDailyBalance) {
		deposit(averageDailyBalance*interestRate);
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	
	public void setInterestRate(double interestRate) {
		this.interestRate=interestRate;
	}
	
	public String toString() {
		String s=super.toString();
		return s+"Interest Rate: "+String.format("%.1f",interestRate*100)+"%";
		
	}
}
