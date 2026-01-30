package EnhancedExercises;
import java.util.Scanner;
public class EnhancedBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many customers you want to check in? ");
        int cNumber = scanner.nextInt();
        scanner.nextLine();
        String[] customers = new String[cNumber];
        int i;
        for (i = 0; i < cNumber; i++) {
            System.out.println("Tell me the customer's number " + (i + 1) + " name");
            customers[i] = scanner.nextLine();
        }
        double KW;
        double[] kw = new double[cNumber];
        double[] bills = new double[cNumber];
        for (i = 0; i < cNumber; i++) {
            System.out.println("Enter how many KW you the customer" + (i + 1) + " consumed: ");
            if (scanner.hasNextDouble()) {
                KW = scanner.nextDouble();
                double bill = 0;
                if (KW <= 100) {
                    bill = 0.5 * KW;
                } else if (KW <= 200) {
                    bill = 50 + ((KW - 100) * 0.75);
                } else if (KW > 200) {
                    bill = 50 + 75 + (KW - 200);
                }
                bills[i] = bill;
                kw[i] = KW;
            }
        }
        int choice;
        do {
            System.out.println("=== Customer Bill Management System ===\n");
            System.out.println("1. Show all customers and their bills\n");
            System.out.println("2. Find customer with highest bill\n");
            System.out.println("3. Find customer with lowest bill\n");
            System.out.println("4. Show total revenue\n");
            System.out.println("5. Show average bill\n");
            System.out.println("6. Search for a customer by name\n");
            System.out.println("7. Exit");
            System.out.println("Enter your choice: \n");
            choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 1) {
                for (i = 0; i < cNumber; i++) {
                    System.out.println("For the customer named " + customers[i] + "\n" + "The consumption is: " + kw[i] + "\n" +
                            "The value of the bill is " + bills[i]);
                }
            }
            if (choice == 2) {
                int maxIndex = findMaxIndex(bills);
                System.out.println("Customer: " + customers[maxIndex]);
                System.out.println("Bill: " + bills[maxIndex]);}
            if (choice == 3) {
                int minIndex = findMinIndex(bills);
                System.out.println("Customer: " + customers[minIndex]);
                System.out.println("Bill: " + bills[minIndex]);}
            if (choice ==4) {
                double sumaFacturi =0;
                for (i=0; i <cNumber; i++){
                    sumaFacturi = sumaFacturi + bills[i];}
                System.out.println("The value of all the bills is " + sumaFacturi);}
            if (choice == 5) {
                double sumaFacturi=0;
                for (i=0; i <cNumber; i++){
                    sumaFacturi = sumaFacturi + bills[i];}
                System.out.println("The average of the bills is " + (sumaFacturi/cNumber));
            }
            if (choice == 6){
                System.out.println("Enter the name of the customer you need to find");
                String verifyName=scanner.nextLine();
                boolean found = false;
                for (i=0; i < cNumber; i++){
                    if(verifyName.equals(customers[i])){
                        found = true;
                        System.out.println("These are the informations about the customer you wanted to find: \n" + "Name: " + verifyName + "\n Consumption " + kw[i]
                                + "\n The value of the bill is " + bills[i]);
                        break;}}
                if (!found){
                    System.out.println("Customer not found");
                }

            }



        } while (choice != 7);


    }
    public static double findMax(double[] arr) {
        double max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;}
    public static int findMaxIndex(double[] arr){
        double max = arr[0];
        int j =0;
        for (int i=0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
                j = i;
            }}
        return j;
    }
    public static int findMinIndex(double[] arr){
        double min = arr[0];
        int j =0;
        for(int i=0; i< arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
                j=i;
            }
        }
        return j;
    }

}