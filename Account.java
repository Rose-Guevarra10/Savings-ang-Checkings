public abstract class Account {
	protected String accountNumber;
	protected String acoountHolderNumber;
	protected double balance;
	
	public Account (String accountNumber, String accountHolderName, double initialBalance) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = initialBalance;	
	}
	
	//deposit
	public abstract void deposit (double amount);
	
	//withdraw
	public abstract void withdraw (double amount);

	//displayAccountInfo
	public void displayAccountInfo(){
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Account Holder Name:" + accountHolderName);
		System.out.println("Balance: " + balance);
		
	}
}