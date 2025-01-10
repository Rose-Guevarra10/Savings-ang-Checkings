public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("Mahal ka ba nya?", "Andrea", 1000.00, 0.05);

  System.out.println("Depositing $500 into Savings Account...");
        savingsAccount.deposit(500.00);
  System.out.println("New balance: " + savingsAccount.getBalance()); 

   System.out.println("Withdrawing $200 from Savings Account...");
        savingsAccount.withdraw(200.00);
  System.out.println("New balance: " + savingsAccount.getBalance());

       CheckingsAccount checkingsAccount = new CheckingsAccount("CA123", "Jane Doe", 500.00, 200.00);
  System.out.println("Depositing $300 into Checking Account...");
        checkingsAccount.deposit(300.00);
   System.out.println("New balance: " + checkingsAccount.getBalance()); 

 System.out.println("Withdrawing $600 from Checking Account (within overdraft limit)...");
        checkingsAccount.withdraw(600.00);
  System.out.println("New balance: " + checkingsAccount.getBalance());

  System.out.println("Withdrawing $800 from Checking Account (exceeds overdraft limit)...");
        checkingsAccount.withdraw(800.00);
  System.out.println("New balance: " + checkingsAccount.getBalance());
    }
}