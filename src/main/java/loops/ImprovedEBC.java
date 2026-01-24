package loops;
import java.util.Scanner;
//EBC = Electricity Bill Calculator
//while loop learning
public class ImprovedEBC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double KW = 0;
        while (KW != -1) {
            System.out.println("Enter how many KW you consumed: ");
            if (scanner.hasNextDouble()) {
                KW = scanner.nextDouble();
                if (KW != -1) {
                    double bill = 0;
                    if (KW <= 100) {
                        bill = 0.5 * KW;
                        System.out.println("The value of the bill is: " + bill);
                    } else if (KW <= 200) {
                        bill = 50 + ((KW - 100) * 0.75);
                        System.out.println("The value of the bill is:  " + bill);
                    } else if (KW > 200) {
                        bill = 50 + 75 + (KW - 200);
                        System.out.println("The value of the bill is:  " + bill);
                    }
                }
            } else if (scanner.hasNextLine()) {
                System.out.println("Please, enter a numeric value");
                scanner.nextLine();}
        }
            if (KW == -1) {
                System.out.println("Exit program");
            }
        }

    }







