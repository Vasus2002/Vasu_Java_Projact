package interfacedemo;

public class Tranction {
public static void main(String args[]) {
		
		Account acc = new Account();
		acc.setAccountName("parth patel");
		acc.setEmail("parth@gmail.com");
		acc.setBalance(5000);
		
		onTransaction tc  = new onTransaction();
		tc.deposit(acc,3000);
		
		System.out.println(acc);
		
		tc.withdrow(acc,1000);
		
		System.out.println(acc);
	}
}
