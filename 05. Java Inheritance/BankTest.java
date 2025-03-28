class BankAccount {
    String accountNumber;
    double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayAccountType() {
        System.out.println("Generic Bank Account");
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Savings Account - Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Checking Account - Withdrawal Limit: $" + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    int tenure;

    public FixedDepositAccount(String accountNumber, double balance, int tenure) {
        super(accountNumber, balance);
        this.tenure = tenure;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Fixed Deposit Account - Tenure: " + tenure + " years");
    }
}

public class BankTest {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA123", 5000, 4.5);
        CheckingAccount ca = new CheckingAccount("CA456", 3000, 1000);
        FixedDepositAccount fda = new FixedDepositAccount("FD789", 10000, 5);
        sa.displayAccountType();
        ca.displayAccountType();
        fda.displayAccountType();
    }
}