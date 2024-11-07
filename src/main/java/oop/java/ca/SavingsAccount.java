package oop.java.ca;

public class SavingsAccount extends BankAccount {

    private double interestRate;
    public SavingsAccount(long accountNumber, String accountHolder, String accountType, double balance, double annualFee, double interestRate){
        super(accountNumber, accountHolder, accountType, balance, annualFee);
        this.interestRate = interestRate;
    }
}
