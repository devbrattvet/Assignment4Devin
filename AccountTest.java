package assignment4;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount Nina=new BankAccount("Nina Master",1000.00,"0001");
		System.out.println(Nina);
		CheckingAccount John=new CheckingAccount("John Smith",500.00,"0002");
		System.out.println(John);
		SavingAccount Amy=new SavingAccount("Amy Smith",15000.00,"0003",3.5);
		System.out.println(Amy);
		
		John.deposit(10000);
		double averageBalance=((500*15)+John.getBalance()*15)/30;
		John.MonthEnd(averageBalance);
		
		
		Amy.withdraw(5000);
		averageBalance=((15000*20)+Amy.getBalance()*10)/30;
		Amy.MonthEnd(averageBalance);
		
		System.out.println();
		System.out.println(Nina);
		System.out.println(John);
		System.out.println(Amy);
	}

}
