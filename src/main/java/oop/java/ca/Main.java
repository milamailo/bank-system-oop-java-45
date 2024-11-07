package oop.java.ca;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a single BankAccount object
            BankAccount account = new BankAccount(123456789, "John Doe", "Savings", 1000.0, 25.0);

            // Display the account details
            System.out.println("Account Details:");
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Account Holder: " + account.getAccountHolder());
            System.out.println("Account Type: " + account.getAccountType());
            System.out.println("Balance: $" + account.getBalance());
            System.out.println("Annual Fees: $" + account.getAnnualFees());
            System.out.println();

            // Deposit money into the account
            try {
                if (account.deposit(500)) {
                    System.out.println("Deposit successful! New balance: $" + account.getBalance());
                } else {
                    System.out.println("Deposit failed.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Error during deposit: " + e.getMessage());
            }


        }
        catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
