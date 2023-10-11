import java.util.ArrayList;
public class PersonalAccount {
    int accountNumber;
    String accountHolder;
    double balance;
    ArrayList<Amount> transactions = new ArrayList<Amount>();

    public PersonalAccount(int accountNumber, String accountHolder){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
    }
    void deposit(double amount){
        Amount temp = new Amount(amount, "Deposit");
        balance += amount;
        transactions.add(temp);
    }
    void withdraw(double amount){
        Amount temp = new Amount(amount, "Withdrawal");
        if(balance < amount){
            System.out.println("Your amount is more than your balance!");
        }else{
            balance -= amount;
        }
        transactions.add(temp);
    }
    void printTransactionHistory(){
        for(Amount i : transactions){
            System.out.println(i);
        }
    }
    void getBalance(){
        System.out.println(balance);
    }
    void getAccountNumber(){
        System.out.println(accountNumber);
    }
    void getAccountHolder(){
        System.out.println(accountHolder);
    }
}
