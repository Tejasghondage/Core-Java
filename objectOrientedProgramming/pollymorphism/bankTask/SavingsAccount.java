package obobjectOrientedProgramming.pollymorphism.bankTask;

public class SavingsAccount extends Account{
@Override

void withdraw(int amount)
{
	int i=0;
	if(i<5) {
	System.out.println("*******************Withdraw*******************");
	balance-=amount;
	i++;
	System.out.println("Dear "+accountHolder+" you have sucessfully withdraw "+amount+" to your account with no "+accountNumber+" your current balance is: "+balance);
	}
	else {
		System.out.println("You have reache your transaction limit !!");
	}
}
public static void main(String[] args) {
	SavingsAccount s = new SavingsAccount();
	s.withdraw(2000);
	
}
}
