import java.util.Scanner;

class BankAccount {
    static String bankName = "Global Bank";
    static int totalAccounts = 0;
    final int accountNumber;
    String accountHolderName;

    public BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();
        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        BankAccount account1 = new BankAccount(name, number);
        account1.displayAccountDetails();
        BankAccount.getTotalAccounts();
        sc.close();
    }
}