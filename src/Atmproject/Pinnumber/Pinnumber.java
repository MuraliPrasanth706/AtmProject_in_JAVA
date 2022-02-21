package Atmproject.Pinnumber;
import  java.util.*;
class pin{
    boolean cardpin = true;
    int count =0,yearCount =0;
    String Pin_Number = "1234";
    String card_Year = "2025";
    Scanner PinInput = new Scanner(System.in);
    public void pinnumber(){
        while (cardpin) {
            System.out.println("Enter the pin number : ");
            String P_Number = PinInput.next();
            if (!Pin_Number.equals(P_Number)) {
                count++;
                System.out.println("Your Pin_Number is Wrong");
                if (count >=1){
                    break;
                }
                continue;
            }else{
                break;
            }
        }
    }
}
class CardExpireYear extends pin{
    public void year() {
        while (cardpin && count <= 1) {
            System.out.println("Enter the Expire year :");
            String Expire_Year = PinInput.next();
            if(!Expire_Year.equals(card_Year)){
                yearCount++;
                System.out.println("Card Year is Wrong");
                if (yearCount >=3){
                    break;
                }
                continue;
            }else{
                break;
            }
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
