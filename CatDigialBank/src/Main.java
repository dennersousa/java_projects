public class Main {

    public static void main(String[] args) {
        Customer marcus = new Customer();
        marcus.setName("Marcus");

        Accounts c_account = new CurrentAccounts(marcus);
        Accounts s_account = new SavingsAccounts(marcus);

        c_account.deposit(100);
        c_account.transfer(100, s_account);

        c_account.printStatement();
        s_account.printStatement();

        Bank bank = new Bank("MyBank");
        bank.addAccount(c_account);
        bank.addAccount(s_account);

        printBankSummary(bank);
    }

    private static void printBankSummary(Bank bank) {
        System.out.println("=== Bank Summary ===");
        System.out.println("Bank Name: " + bank.getName());
        System.out.println("Number of Accounts: " + bank.getAccounts().size());
        for (Accounts account : bank.getAccounts()) {
            System.out.println(account);
        }
    }
}
