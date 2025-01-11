package encapsulation;

public class BankAccount {
    private String account_number;
    private String account_holder_name;
    private int balance;
    public String getAccount_number() {
        return account_number;
    }
    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }
    public String getAccount_holder_name() {
        return account_holder_name;
    }
    public void setAccount_holder_name(String account_holder_name) {
        this.account_holder_name = account_holder_name;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        if(balance < 0) {
            System.out.println("Balance can't be negative");
        } else {
            this.balance = balance;
        }
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.setAccount_number("1234567890");
        b.setAccount_holder_name("John Doe");
        b.setBalance(1000);
        System.out.println("Account Number: " + b.getAccount_number());
        System.out.println("Account Holder Name: " + b.getAccount_holder_name());
        System.out.println("Balance: " + b.getBalance());

        BankAccount b2 = new BankAccount();
        b2.setAccount_number("0987654321");
        b2.setAccount_holder_name("Mukund Doe");
        b2.setBalance(-1000);
        System.out.println("Account Number: " + b2.getAccount_number());
        System.out.println("Account Holder Name: " + b2.getAccount_holder_name());
        System.out.println("Balance: " + b2.getBalance());
    }

}
