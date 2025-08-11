package obobjectOrientedProgramming.pollymorphism.bankTask;


public class Account {
long accountNumber =1020304050;
String accountHolder="Tejas Subhash Ghondage";
double balance=10000.00;
void deposit(int amount)
{    
	System.out.println("*******************Deposit*******************");
	balance+=amount;
	System.out.println("Dear "+accountHolder+" you have sucessfully deposited "+amount+" to your account with no "+accountNumber+" your current balance is: "+balance);
	
}
void withdraw(int amount)
{
	System.out.println("*******************Withdraw*******************");
	balance-=amount;
	System.out.println("Dear "+accountHolder+" you have sucessfully withdraw "+amount+" to your account with no "+accountNumber+" your current balance is: "+balance);
}
void displayAccountInfo()
{
	System.out.println("*******************AccountInfo*******************");
	System.out.println("Account Holder: "+accountHolder);
	System.out.println("Account Number: "+accountNumber);
	System.out.println("Account Balance: "+balance);
}
public static void main(String[] args) {
	Account a =new Account();
	a.deposit(12000);
	a.withdraw(5000);
	a.displayAccountInfo();
}
}
