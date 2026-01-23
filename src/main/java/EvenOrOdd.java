import java.util.Scanner; // 1. Importăm unealta

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        System.out.println("Give me a number, I will tell if its Even or Odd");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number is Even");}
            else{
            System.out.println("The number is Odd");}
        }


    }







