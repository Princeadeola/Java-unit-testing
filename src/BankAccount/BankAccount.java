package BankAccount;

public class BankAccount {
    private String firstName;
    private String lastName;
    private double balance;

    public BankAccount(String firstName, String lastName, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    // the branch is true if the customer is performing the transaction in the bank with a
    // teller and is false if it is performed in the ATM
    public double deposit(double amount, boolean branch){
        balance += amount;
        return balance;
    }

    public  double withdraw(double amount, boolean branch){
        balance -= amount;
        return balance;
    }

    public double getBalance() {
        return balance;
    }

    // performing other functions
}
