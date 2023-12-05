import java.util.List;

public class Bank {

    private String name;
    private List<Accounts> accounts;

    public Bank(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Accounts> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Accounts> accounts) {
        this.accounts = accounts;
    }

    public void addAccount(Accounts account) {
        accounts.add(account);
    }
}
