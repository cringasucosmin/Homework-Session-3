package loops;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Women: Give me a number:");
        int Number = scanner.nextInt();
        int iNumber=Number;
        int lastdigit=0;
        int reversed=0;

        while (Number !=0){
            reversed = reversed * 10 + (Number%10);
            Number = Number/10;
        }
        if (reversed==iNumber){
            System.out.println(iNumber + " is a palindrome.");
        }
        else {
            System.out.println(iNumber + " is not a palindrome.");}

    }

}