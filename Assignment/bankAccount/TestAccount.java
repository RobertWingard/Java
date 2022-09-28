import java.util.Random;

public class TestAccount{
    public static void main(String[] args){
        BankAccount bank = new BankAccount();
        bank.accountDeposit(10.00, "check");
        bank.accountWithdraw(5.00, "save");
        bank.accountBalance();
        System.out.println(BankAccount.getTotalAmount());
    }
}