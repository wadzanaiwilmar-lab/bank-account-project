package bankAccountProject;

public class Account {
	//Create an Account class with two fields: owner (a String) and balance (a double).
	String owner;
	 double balance ;
	//Add a deposit(double amount) method that adds money to the balance.
	void deposit(double amount) {
		balance+=amount;
	
	}
	//Add a withdraw(double amount) method that subtracts money, but only if the balance is enough.
	//If it isn’t, print a message such as Insufficient funds and leave the balance unchanged.
	void withdraw(double amount) {
		if(balance>=amount) {
			System.out.println("Success!");
			balance-=amount;
		}
	
		else {
			System.out.println("Insufficient funds");
		}
		
	}
	double getBalance() {
		//System.out.println("Balance remaining after withdrawal:");
		return balance;
	}
	void transfer(Account to, double amount) {
		if(balance>=amount){
			balance-=amount;
			to.balance+=amount;
			System.out.println("Transfer done!");
			
		}
		else {
			
		System.out.println("Transfer failed. Insufficient funds");
		}
	}
	public static void main(String[] args) {
		// In main, create two accounts, make a few deposits and withdrawals on each, and print the balances.
		Account acc = new Account();
		Account acc2 = new Account();
		acc.owner = "Wadzanai";
		acc2.owner = "Pam";
		acc.balance = 500.00;
		acc2.balance = 200.00;
		// printing balances in each account
		System.out.println(acc.owner+":"+acc.balance);
		System.out.println(acc2.owner+":"+acc2.balance);
		acc.deposit(200.00);
		acc2.deposit(400.00);
		//balance after deposit
		System.out.println(acc.owner + " Balance after deposit:" +acc.balance);
		System.out.println(acc2.owner + " Balance after deposit:" +acc2.balance);
		acc.withdraw(1000.00);
		System.out.println(acc.owner + " Balance after withdrawal:" + acc.getBalance()); //balance after withdrawal
		acc2.withdraw(100.00);
		System.out.println(acc2.owner + " Balance after withdrawal:" +acc2.getBalance());
		acc.transfer(acc2, 400.00);
		System.out.println(acc.owner + " balance after transfer: " + acc.getBalance());
		System.out.println(acc2.owner + " balance after receiving: " + acc2.getBalance());
	}

}
