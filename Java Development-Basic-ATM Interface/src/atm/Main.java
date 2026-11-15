
package atm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Creating bank accounts
        BankAccount account1 = new BankAccount(5000);
        BankAccount account2 = new BankAccount(3000);

        // Creating users
        User user1 = new User("user101", "1234", account1);
        User user2 = new User("user102", "5678", account2);

        // Starting ATM
        ATM atm = new ATM(user1, user2, input);

        atm.start();

        input.close();
    }
}
