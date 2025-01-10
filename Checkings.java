public class CheckingsAccount extends Account {

    private double overdraftLimit;

    public CheckingsAccount(String accountNumber, String accountHolderName, double initialBalance, double overdraftLimit) {
        super(accountNumber, accountHolderName, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }
  @Override
    public void deposit(double amount) {
        balance += amount;
	}
    @Override
    public void withdraw(double amount) {
        if (balance - amount >= -overdraftLimit) {
            balance -= amount;
        } else {
            System.out.println("Withdrawal exceeds overdraft limit");
        }
    }
}