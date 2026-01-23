import java.util.Scanner; // 1. Importăm unealta

public class LargestOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int first = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int second = scanner.nextInt();
        System.out.println("Enter the third number: ");
        int third = scanner.nextInt();
        int vmaxim = 0;

        if (first > second) {
            vmaxim = first;}
                    else if ( second > first ){
                        vmaxim = second;
            }
        if (vmaxim > third){
            System.out.println("The largest number is: " + vmaxim);}
            if (third > vmaxim){
                vmaxim = third;
                System.out.println("The largest number is: " + vmaxim);}



    }
}