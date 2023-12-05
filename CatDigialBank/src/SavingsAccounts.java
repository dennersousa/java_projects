public class SavingsAccounts extends Accounts {

    public SavingsAccounts(Customer customer) {
        super(customer);
    }

    @Override
    public void printStatement() {
        System.out.println("=== Savings Account Statement ===");
        super.printCommonInfo();
    }
}
