package Atmproject.Pinnumber;
import transaction.transactionType;

import  java.util.*;
class pin{
    boolean cardpin = true;
    int Pincount =0,yearCount =0;
    String Pin_Number = "1234";
    String card_Year = "2025";
    Scanner PinInput = new Scanner(System.in);
    public void pinnumber(){
        while (cardpin) {
            System.out.println("Enter the pin number : ");
            String P_Number = PinInput.next();
            if (!P_Number.equals(Pin_Number)) {
                Pincount++;
                System.out.println("Your Pin_Number is Wrong");
                if (Pincount >=3){
                    break;
                }
                continue;
            }else{
                System.out.println("Processed");
                break;
            }
        }
    }


}
class CardExpireYear extends pin {
    public void year() {
        while (cardpin && Pincount <3) {
            System.out.println("Enter the Expire year :");
            String Expire_Year = PinInput.next();
            if (!Expire_Year.equals(card_Year)) {
                yearCount++;
                System.out.println("Card Year is Wrong");
                if (yearCount >= 3) {
                    break;
                }
                continue;
            } else {
                System.out.println("Processed");
                break;
            }
        }
        //Transaction Type
        if (Pincount <= 2 && yearCount <= 2) {
            transactionType.main(null);
        }
    }
}
public class Pinnumber {
    public static void main(String[] args) {
        CardExpireYear carddetails = new CardExpireYear();
        carddetails.pinnumber();
        carddetails.year();

    }

}
//public class Pinnumber {
//    public static void main(String[] args) {
//
//    }
//}
