package Conditionals;

import java.util.Scanner; // 1. Importăm unealta

public class SimpleQuizzGame {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        System.out.println("What is 5 + 3?");
        int score = 0;
        double answer1=scanner.nextDouble();
        if (answer1 == 8){
            System.out.println("Correct!");
        score++;}
        if (answer1 != 8){
            System.out.println("Incorrect!");
            }
        System.out.println("What is 10 * 2?");
        double answer2=scanner.nextDouble();
        if (answer2 == 20){
            System.out.println("Correct!");
            score++;}
        if (answer2 !=20){
            System.out.println("Incorrect!");}
        System.out.println("What is 15 / 3?");
        double answer3=scanner.nextDouble();
        if (answer3 == 5){
            System.out.println("Correct!");
            score++;}
        if (answer3 != 5){
            System.out.println("Incorrect!");
        }
        System.out.println("Your score is " + score + "/3");


    }


    }