package Assignments;

public class AccountwithoutusingConstructor {
	
	int accno;
	String name;
	double amount;
	
	void insert(int a, String n,double amt) {
		accno=a;
		name=n;
		amount=amt;
	}
	
	//deposit method
	void deposit(double amt) {
		amount = amount +amt;
		System.out.println("Deposited amount is "+amt);
		
	}
	
	//withdraw method
	void withdraw(double amt) {
		if(amount<amt) {
			System.out.println("Insufficient balance");
		}
			amount = amount - amt;
			System.out.println("Withdrawal amount is" + amt);
	}

	//method to check balance
	void checkBalance() {
		System.out.println("The Balance amount is" +amount);
	}
	
	//method to display the acoount details
	void displayBalance() {
		System.out.println(accno + name + amount );
	}
}
