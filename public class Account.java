public class Account {
public static void main(String[] args) {
    Account myAccount = new Account(1000.0);
    myAccount.setInterestRate(0.05);
    myAccount.deposit(500.0);
    myAccount.withdraw(200.0);
    System.out.println("Current balance: $" + myAccount.getBalance());
    System.out.println("Interest earned: $" + myAccount.computeInterest());
}
    private double balance;
    private double interestRate;
    private double penalty = 5.0;

    // Constructor to initialize balance with a given amount
    public Account(double initialBalance) {
        balance = initialBalance;
    }

    // Constructor to initialize balance with 0
    public Account() {
        balance = 0;
    }

    // Function to add money to the account
    public void deposit(double amount) {
        balance += amount;
    }

    // Function to withdraw money from the account
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            balance -= penalty;
            System.out.println("Withdrawal amount exceeds balance. Penalty of $5 charged.");
        }
    }

    // Function to compute interest on the current balance
    public double computeInterest() {
        return balance * interestRate;
    }

    // Function to inquire the current balance
    public double getBalance() {
        return balance;
    }

    // Function to set the interest rate
    public void setInterestRate(double rate) {
        interestRate = rate;
    }
}
