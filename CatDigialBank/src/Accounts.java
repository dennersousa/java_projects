import java.util.Locale;

public abstract class Accounts implements IAccount {

    private static final int DEFAULT_AGENCY = 1;
    private static int SEQUENTIAL = 1;

    protected int agency;
    protected int number;
    protected double balance;
    protected Customer customer;

    public Accounts(Customer customer) {
        this(DEFAULT_AGENCY, customer);
    }

    public Accounts(int agency, Customer customer) {
        this.agency = agency;
        this.number = SEQUENTIAL++;
        this.customer = customer;
    }

    @Override
    public void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Withdraw amount cannot be negative.");
            return;
        }
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }

    @Override
    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Deposit amount cannot be negative.");
            return;
        }
        balance += amount;
    }

    @Override
    public void transfer(double amount, IAccount destinationAccount) {
        if (amount < 0) {
            System.out.println("Transfer amount cannot be negative.");
            return;
        }
        if (balance >= amount) {
            this.withdraw(amount);
            destinationAccount.deposit(amount);
        } else {
            System.out.println("Insufficient funds for transfer.");
        }
    }

    public int getAgency() {
        return agency;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    protected void printCommonInfo() {
        System.out.println("Holder: " + this.customer.getName());
        System.out.println("Agency: " + this.agency);
        System.out.println("Number: " + this.number);
        System.out.printf(Locale.US, "Balance: %.2f%n", this.balance);
    }

    @Override
    public String toString() {
        return String.format("Account: %d - %s", this.number, this.customer.getName());
    }
}
