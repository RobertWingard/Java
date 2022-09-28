import java.util.Random;

public class BankAccount{
    private double checkingBalance;
    private double savingsBalance;
    private static int numAccountsCreated;
    private static double totalAmount;


    public BankAccount(){
        numAccountsCreated++;
    }

    public void accountDeposit(double amount, String accType){
        BankAccount.totalAmount += amount;
        if(accType == "check"){
            this.checkingBalance += amount;
        System.out.println("Deposit to Checking Complete: " + this.checkingBalance);
        }else{
            this.savingsBalance += amount;
            System.out.println("Deposit to Savings Complete: " + this.savingsBalance);
        }

    }

    public void accountWithdraw(double amount, String accType){
        if(accType == "save"){
            if (savingsBalance <= 0){
            System.out.println("Insufficient Funds");
            }else{
            this.savingsBalance -= amount;
            BankAccount.totalAmount -= amount;
            System.out.println("Withdrawl from savings Comeplete: " + this.savingsBalance);
            }
        }else{
            this.checkingBalance -= amount;
            BankAccount.totalAmount -= amount;
            System.out.println("Withdrawl from checking Complete: " + this.checkingBalance);
        }
        
    }

    public void accountBalance(){
        double total = this.checkingBalance + this.savingsBalance;
        System.out.println("Total Amount from both accounts: " + total);
    }



    // getter

    public double getCheckingBalance(){
        return this.checkingBalance;
    }

    public double getSavingsBalance(){
        return this.savingsBalance;
    }
    public static double getTotalAmount(){
        return BankAccount.totalAmount;
    }
}