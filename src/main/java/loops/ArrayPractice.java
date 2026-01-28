package loops;
import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many customers?");
        int numCustomers = scanner.nextInt();
        double total = 0;
        int i;
        double[] bills = new double[numCustomers];
        for (i = 0; i < bills.length; i++) {
            System.out.println("Enter KW for customer " + (i + 1) + ":");
            double KW = scanner.nextDouble();
            double bill = 0;
                    if (KW <= 100) {
                        bill = 0.5 * KW;
                        bills[i] = bill;
                    } else if (KW <= 200) {
                        bill = 50 + ((KW - 100) * 0.75);
                        bills[i] = bill;
                    } else if (KW > 200) {
                        bill = 50 + 75 + (KW - 200);
                        bills[i] = bill;
                    }

                    total = total + bills[i];}
        for (i=0; i < bills.length; i++){
            System.out.println("The value of the bill for customer " + (i + 1) + " is: " + bills[i]);}
        System.out.println("The total of the bills is: " + total);
        System.out.println("The average of the bills is: " + (total/numCustomers));

        }


        // Step 4: Print all bills and calculate total
        // TODO: Loop through bills array and print each one
        // TODO: Calculate total and average

}