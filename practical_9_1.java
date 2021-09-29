interface Account {
    void deposit(int amount);
    void withdraw(int amount) throws InsufficientFundsException;
}
class SavingAccount implements Account {
    int Balance = 3000;
    public void deposit(int amount) {
        Balance = Balance + amount;
        System.out.println("Balance after deposit is : " + Balance);
    }
    public void withdraw(int amount) throws InsufficientFundsException {
        if (amount > Balance) {
            throw new InsufficientFundsException("Insufficient Funds");
        } else {
            Balance = Balance - amount;
            System.out.println("Balance after deposit is : " + Balance);
        }
    }
}
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String msg) {
        super(msg);
    }
}
public class practical_9_1 {
    public static void main(String[] args) throws InsufficientFundsException {
        SavingAccount sA = new SavingAccount();
        sA.deposit(5000);
        sA.withdraw(3000);
        sA.withdraw(6000);
    }
}
