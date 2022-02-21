package transaction;
import java.util.*;

class transMode{
    int  Creditamount,WithdrawMoney,TotalAmount_in_Bank ;
    int TotalAmount_in_account = 10000;
    Scanner TypeInput = new Scanner(System.in);
    public void transactionMode(){
        System.out.println("Enter the amount to Withdraw : ");
         WithdrawMoney =TypeInput.nextInt();
        if (WithdrawMoney > TotalAmount_in_account){
            System.out.println("Not Sufficient Balance");
        }else if(WithdrawMoney <= TotalAmount_in_account){
            System.out.println("Money Withdraw SuccessFully");
        }
        
        int ch;
        System.out.println("1.Check Balance \n 2.Exit");
        ch = TypeInput.nextInt();
        switch (ch){
            case 1:
                TotalAmount_in_Bank = TotalAmount_in_account-WithdrawMoney;
                System.out.println("Total_Balance :"+TotalAmount_in_Bank);
                break;
            case 2:
                exit(0);
                break;
        }
    }

    public void exit(int i) {
    }
}
class creditMode extends transMode{
    public void CreditAmountMode(){
        System.out.println("Enter amount to Credit :");
         Creditamount = TypeInput.nextInt();
        if (Creditamount <100  ){
            System.out.println("Less Then 100 is Not Allowed To Credit");
        }else if (Creditamount >=100) {
            System.out.println("Amount Credit Successfully");
        }
        int ch;
        System.out.println("1.Check Balance \n 2.Exit");
        ch = TypeInput.nextInt();
        switch (ch){
            case 1:
                if (Creditamount >=100) {
                    TotalAmount_in_Bank = TotalAmount_in_account + Creditamount;
                    System.out.println("Total_Balance :" + TotalAmount_in_Bank);
                }
                break;
            case 2:
                exit(0);
                break;
        }
    }
}
class BalanceMode extends transMode{
    public void BalanceAmount(){
        System.out.println("Balance : " +TotalAmount_in_Bank);
    }
}
class TransactionMOde{
    Scanner Allmode = new Scanner(System.in);
    public void Money(){
        System.out.println("Enter the choice \n 1.Withdraw \n 2.credit \n 3.Balance " );
        int Choice = Allmode.nextInt();
        switch (Choice){
            case 1:
                transMode obj = new transMode();
                obj.transactionMode();
                break;
            case 2:
                creditMode obj1 = new creditMode();
                obj1.CreditAmountMode();
                break;
            case 3:
                BalanceMode obj2 = new BalanceMode();
                obj2.BalanceAmount();
        }
    }
}
public class transactionType {
    public static void main(String[] args) {
        TransactionMOde amount = new TransactionMOde();
        amount.Money();
    }
}
