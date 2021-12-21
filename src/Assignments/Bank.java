package Assignments;

public class Bank {

	public static void main(String[] args) {
		Account account1 = new Account(9876890, "Jake Williams", 2000.00); //creating object instance
		account1.getAccountNo();
		account1.getName();
		account1.getBalance();
		account1.withdraw(100.25);
		account1.deposit(500.25);
		System.out.println("Account number is :" + account1.getAccountNo());
		System.out.println("Name of the account holder is :" + account1.getName());
		System.out.println("the balance in account is :" + account1.getBalance());
	}

}
