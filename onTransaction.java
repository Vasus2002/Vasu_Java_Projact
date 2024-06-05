package interfacedemo;

public class onTransaction {
	public void deposit(Account acc,int amount) {
		
		int newBalance = acc.getBalance() +amount;
		acc.setBalance(newBalance);
		
		System.out.println("Nalance Deposited");
	}
	public void withdrow(Account acc,int amount) {
		
		int newBalance = acc.getBalance() - amount;
		acc.setBalance(amount);
		
		System.out.println("Balance updated");
	}
}
