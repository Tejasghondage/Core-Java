package obobjectOrientedProgramming.pollymorphism.bankTask;

public class CurrentAccount extends Account {
	@Override
	void withdraw(int amount)
	{
		int i=61;
		if(i<60) {
		System.out.println("*******************Withdraw*******************");
		balance-=amount;
		i++;
		System.out.println("Dear "+accountHolder+" you have sucessfully withdraw "+amount+" to your account with no "+accountNumber+" your current balance is: "+balance);
		}
		else  {
			System.out.println("You have reached your transaction limit !! now you will be charged 2% tax for further transactions");
			System.out.println("*******************Withdraw*******************");
			balance-=amount;
			balance=(balance*100)/2;
		
			System.out.println("Dear "+accountHolder+" you have sucessfully withdraw "+amount+" to your account with no "+accountNumber+" your current balance is: "+balance);
			
		}
	}
	public static void main(String[] args) {
		CurrentAccount c = new CurrentAccount();
		c.withdraw(5000);
	}
}
