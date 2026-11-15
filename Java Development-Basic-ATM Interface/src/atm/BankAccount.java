
package atm;

import java.util.ArrayList;

public class BankAccount {

    private double balance;
    private ArrayList<Transaction> history;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
        history = new ArrayList<>();
    }

    public double getBalance() {
        return balance;
    }

    // Deposit money
    public void deposit(double amount) {

        if (amount > 0) {

            balance += amount;

            history.add(
                    new Transaction("Deposit", amount)
            );

            System.out.println("Deposit successful!");

        } else {
            System.out.println("Invalid amount!");
        }
    }

    // Withdraw money
    public boolean withdraw(double amount) {

        if (amount > 0 && amount <= balance) {

            balance -= amount;

            history.add(
                    new Transaction("Withdrawal", amount)
            );

            System.out.println("Withdrawal successful!");

            return true;

        } else {

            System.out.println("Insufficient balance or invalid amount!");

            return false;
        }
    }

    // Transfer money
    public void transfer(double amount, BankAccount receiver) {

        if (amount > 0 && amount <= balance && receiver != this) {

            balance -= amount;
            receiver.balance += amount;

            history.add(
                    new Transaction("Transfer Sent", amount)
            );

            receiver.history.add(
                    new Transaction("Transfer Received", amount)
            );

            System.out.println("Transfer successful!");

        } else {

            System.out.println("Transfer failed!");
        }
    }

    // Transaction history
    public void showHistory() {

        System.out.println("\n===== TRANSACTION HISTORY =====");

        if (history.isEmpty()) {
            System.out.println("No transactions yet.");
            return;
        }

        for (Transaction t : history) {
            t.displayTransaction();
        }
    }
}
