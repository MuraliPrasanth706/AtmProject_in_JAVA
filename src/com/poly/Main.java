package com.poly;
import java.util.*;
import Atmproject.Pinnumber.Pinnumber;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // write your code here
        boolean num = true;
        String username = "Murali";
        String password = "12345Murali";
        int count = 0,passwordCount =0;

        while(num) {
            System.out.println("Entre the user name : ");
            String Confirmusername = input.next();
            if (!username.equals(Confirmusername)) {
                count++;
                System.out.println("Username iss incorrect");
                if (count >= 3) {
                    System.out.println("To Many attempts");
                    break;
                }
                continue;
            } else {
                System.out.println("Processed");
                break;
            }
        }

            while (num && count <3) {
                System.out.println("Enter the password");
                String Confirmpassword = input.next();

                if (!password.equals(Confirmpassword)) {
                    passwordCount++;
                    System.out.println("Your Password is incorrect");
                    if (passwordCount >= 3) {
                        System.out.println("To Many attempts");
                        break;
                    }
                    continue;
                } else {
                    System.out.println("Processed");
                    break;
                }

        }
        if(count <3 && passwordCount <3) {
            Pinnumber.main(null);
        }
    }
}
