package oop.java.ca;

public class BankAccount {
    private long accountNumber;
    private String accountHolder;
    private String accountType;
    protected double balance;
    protected double annualFees;

    public BankAccount(long  accountNumber, String accountHolder, String accountType, double balance, double annualFees) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.accountType = accountType;
        this.balance = balance;
        this.annualFees = annualFees;
    }

    public boolean deposit(double amount) throws IllegalArgumentException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be greater than zero.");
        } else {
            balance += amount;
            return true;
        }
    }

    public boolean withdraw(double amount) throws IllegalArgumentException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be greater than zero.");
        } else if (balance < amount) {
            throw new IllegalArgumentException("The amount is more than your Balance for withdrawal.");
        } else {
            balance -= amount;
            return true;
        }
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualFees() {
        return annualFees;
    }
}
