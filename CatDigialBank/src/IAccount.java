public interface IAccount {
    
    void withdraw(double amount);
    
    void deposit(double amount);
    
    void transfer(double amount, IAccount destinationAccount);
    
    void printStatement();

}
