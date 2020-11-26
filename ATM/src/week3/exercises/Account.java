package week3.exercises;

public class Account {
private String username;
private int userId;
private double balance;
public static String bankname = "SS BANK Ltd.";

public Account (String username , int userId , double balance) {
	this.username=username;
	this.userId=userId;
	if(balance > 0) {
	this.balance=balance;
	}
	else {
		System.out.println("Balance cannot be zero or negative ");	
	}
}
public double getBalance () {
	return balance;
}
public void showAccountDetails() {
	System.out.println("Account Details : \n\nUser Name :" +username + "\nUser Id : " +userId + "\nBankname :" +bankname + "\nBalance : " +getBalance ()+"$");
}
public void setCredit(double amount) {
	this.balance=this.balance+amount;
}
public void setDebit (double amount) {
	if(amount < this.balance) {
		this.balance=this.balance-amount;
	}
	else {
		System.out.println("Debit amount cannot be 0 or negative ");
	}
	System.out.println("Balance after debit : "+balance+"$");
}
}
