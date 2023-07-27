package practice.practiceBankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("1234567890");
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: $" + account.getBalance());
        
        account.deposit(100.0);
        account.withdraw(50.0);
        
        System.out.println("Balance: $" + account.getBalance());
    }
}