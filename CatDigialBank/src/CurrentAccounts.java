public class CurrentAccounts extends Accounts {

    public CurrentAccounts(Customer customer) {
        super(customer);
    }

    @Override
    public void printStatement() {
        System.out.println("=== Current Account Statement ===");
        super.printCommonInfo();
    }
}