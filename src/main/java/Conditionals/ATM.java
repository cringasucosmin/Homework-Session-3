package Conditionals;

import java.util.Scanner; // 1. Importăm unealta

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = 1000;
        System.out.println("What do you want to do today? " +
                "1 = Deposit money" +
                "2 = Withdraw money" +
                "3 = Check balance");
        int option = scanner.nextInt();
        if (option == 1) {
            System.out.println("How much money do you want to deposit?");
            int deposit = scanner.nextInt();
            start = start + deposit;
            System.out.println("Your new balance is: " + start);
        }
        if (option == 2) {
            System.out.println("How much money do you want to withdraw?");
            int withdraw = scanner.nextInt();
            if (withdraw > start) {
                System.out.println("We can not perform this action");}
            if (start >= withdraw) {
                start = start - withdraw;
                System.out.println("Your new balance is: " + start);}
        }
        if (option == 3) {
            System.out.println("Your balance is: " + start);
        }
    }
}