
class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    String getAccountHolder() {
        return accountHolder;
    }

    String getAccountNumber() {
        return accountNumber;
    }

    double getBalance() {
        return balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful: " + amount);
        }
    }

    void display() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {

        BankAccount b1 = new BankAccount("Rahul", "123456789", 5000);

        System.out.println("Initial Account Details:");
        b1.display();

        System.out.println();

        b1.deposit(2000);
        b1.deposit(-500);

        b1.withdraw(1000);
        b1.withdraw(0);
        b1.withdraw(-200);
        b1.withdraw(10000);

        System.out.println();

        System.out.println("Updated Account Details:");
        b1.display();
    }
}
