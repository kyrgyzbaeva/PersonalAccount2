public class Main {
    public static void main(String[] args){

        PersonalAccount logIn = new PersonalAccount(220104090, "Kyrgyzbaeva Amina");

        logIn.deposit(10000);
        logIn.getBalance();
        logIn.withdraw(999);
        logIn.getBalance();
        logIn.getAccountHolder();
        logIn.getAccountNumber();
        logIn.printTransactionHistory();
    }
}