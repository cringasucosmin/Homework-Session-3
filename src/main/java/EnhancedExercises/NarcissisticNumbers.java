package EnhancedExercises;
import java.util.Scanner;

import static java.lang.Math.pow;

public class NarcissisticNumbers {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n=scanner.nextInt();
        double check=0;
        int initialN=n;
        int digits=0;
        boolean isNarcissistic = true;
        while (n>0){
            digits ++;
            n= n/10;}
        n=initialN;
        while (n>0){
            check = check + pow(n%10,digits);
            n= n/10;}
        if(check==initialN){
            System.out.println(isNarcissistic);
        }
        else{
            System.out.println(!isNarcissistic);
        }

    }}
