
package atm;

import java.util.Scanner;

public class ATM {

    private User user;
    private User receiver;
    private Scanner input;

    public ATM(User user, User receiver, Scanner input) {

        this.user = user;
        this.receiver = receiver;
        this.input = input;
    }

    public void start() {

        System.out.println("\n===== WELCOME TO ATM =====");

        System.out.print("Enter User ID: ");
        String id = input.nextLine();

        System.out.print("Enter PIN: ");
        String pin = input.nextLine();

        if (!user.login(id, pin)) {

            System.out.println("Invalid ID or PIN!");
            return;
        }

        System.out.println("\nLogin Successful!");

        int choice;

        do {

            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Transfer Money");
            System.out.println("5. Transaction History");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            switch (choice) {

                case 1:

                    System.out.println(
                            "Balance: Rs. " +
                                    user.getAccount().getBalance()
                    );

                    break;

                case 2:

                    System.out.print("Enter deposit amount: ");

                    double deposit = input.nextDouble();

                    user.getAccount().deposit(deposit);

                    break;

                case 3:

                    System.out.print("Enter withdrawal amount: ");

                    double withdrawal = input.nextDouble();

                    user.getAccount().withdraw(withdrawal);

                    break;

                case 4:

                    System.out.print("Enter transfer amount: ");

                    double transfer = input.nextDouble();

                    user.getAccount().transfer(
                            transfer,
                            receiver.getAccount()
                    );

                    break;

                case 5:

                    user.getAccount().showHistory();

                    break;

                case 6:

                    System.out.println(
                            "Thank you for using ATM!"
                    );

                    break;

                default:

                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);
    }
}
