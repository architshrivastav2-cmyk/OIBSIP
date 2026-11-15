
package atm;

public class User {

    private String userId;
    private String pin;
    private BankAccount account;

    public User(String userId, String pin, BankAccount account) {
        this.userId = userId;
        this.pin = pin;
        this.account = account;
    }

    public boolean login(String id, String enteredPin) {
        return userId.equals(id) && pin.equals(enteredPin);
    }

    public BankAccount getAccount() {
        return account;
    }
}
