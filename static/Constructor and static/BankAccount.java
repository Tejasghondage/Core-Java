package statics.mathOperation;

public class BankAccount {
String accountNumber ;
String accountHolder;
static double balance;
static String bankName;
 BankAccount() {
	this.accountNumber="unknown";
	this.accountHolder="unknown";
	BankAccount.balance=0.0;
}
BankAccount(String accountNumber ,String accountHolder,double balance)
{
	this.accountHolder=accountHolder;
	this.accountNumber=accountNumber;
	BankAccount.balance=balance;
}
void deposit(double amount) {
	BankAccount.balance+=amount;
	System.out.println("You have sucessfully deposited amount :"+amount);
	System.out.println("Your current balance is :"+BankAccount.balance);
}
void withdraw(double amount) {
	if(BankAccount.balance>amount)
	{
	BankAccount.balance-=amount;
	System.out.println("You have Sucessfully Withdrawed amount :"+amount);
	System.out.println("Your current balance is :"+BankAccount.balance);
	}
	else {System.out.println("Insufficient Funds... !!!");}
}
void printAccountDetails() {
	System.out.println("Bank Name      :"+BankAccount.bankName);
	System.out.println("Account Number :"+this.accountNumber);
	System.out.println("Account Holder :"+this.accountHolder);
	System.out.println("Account Balance:"+BankAccount.balance);
	}
static void setBankName(String name)
{
	BankAccount.bankName=name;
}
public static void main(String[] args) {
	BankAccount b=new BankAccount("1020232562","Tejas Suhhash Ghondage",101020.5236);
	b.deposit(24524.02);
	b.withdraw(1000);
	BankAccount.setBankName("Central Bank Of India ");
	b.printAccountDetails();
}
}
