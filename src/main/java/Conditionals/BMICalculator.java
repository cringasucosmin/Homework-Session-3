package Conditionals;

import java.util.Scanner; // 1. Importăm unealta

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        System.out.println("How much do you weight? ");
    double kg = scanner.nextDouble();
        System.out.println("What is your height?");
    double m = scanner.nextDouble();
    double BMI = kg/(m*m);

    if (BMI < 18.5){
        System.out.println("Your BMI is: " + BMI);
        System.out.println("Underweight");
    }
    if ((BMI > 18.5) && (BMI <= 24.9)){
        System.out.println("Your BMI is: " + BMI);
        System.out.println("Normal");
    }
        if ((BMI > 25) && (BMI < 29.9)){
            System.out.println("Your BMI is: " + BMI);
        System.out.println("Normal");
    }
        if (BMI > 30){
            System.out.println("Your BMI is: " + BMI);
            System.out.println("Obese");
        }

}
}