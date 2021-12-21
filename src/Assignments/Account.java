package Assignments;

/*
 * Create a class Account with following attributes – account number, name, balance.
 *  Write constructor to initialize Account objects. Write methods to get account balance, deposit money and withdraw 
money from the account. The amount of money to be deposited orcwithdrawn should be passed as parameters.
(Tip: Check balance before withdrawing the money.).Create a class Bank with main()method and create some
account objects and deposit and withdraw money from the account
 */
public class Account {
	
	private int accountNumber;
	private String name;
	private double balance;
	
	//Creating a Constructor 
	Account(int accnum,String Name,double bal){
		accountNumber=accnum;
		name=Name;
		balance=bal;
	}
	
//setand getmethods
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setAccountNo(int accountNumber) {
		this.accountNumber=accountNumber;
	}
	public int getAccountNo() {
		return accountNumber;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	public double getBalance() {
		return balance;
	}
	
	
	//Creating method for deposit
	public void deposit(double depositAmount) {
		balance=balance+depositAmount;
	}
	//Creating method for withdrawal
	public void withdraw(double withdrawAmount) {
		if (balance>=withdrawAmount) {
				balance=balance-withdrawAmount;
		}
	}
	}

/*

public static double accbalance(double amountWithdrawn, double amountDeposit, double TotalBalance, double NetBalance) {
	TotalBalance = balance+amountDeposit;
	NetBalance=TotalBalance-amountWithdrawn;
	return NetBalance;
}
*/