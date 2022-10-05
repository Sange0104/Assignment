package Assignments;

public class BankwithoutusingConstructor {

	public static void main(String[] args) {
		AccountwithoutusingConstructor account = new AccountwithoutusingConstructor();
		account.insert(100, "Tom", 2000.50);
		account.displayBalance();
		account.deposit(300.25);
		account.checkBalance();
		account.withdraw(200.10);
		account.checkBalance();
		

	}

}
