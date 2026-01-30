package EnhancedExercises;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers do you want to generate? ");
        int count = scanner.nextInt();
        int[] sequence = new int[count];
        int a = 0;
        int b = 1;
        int i;
        sequence[0]=0;
        sequence[1]=1;
        for (i = 2; i < count; i++) {
            int c = a+b;
            sequence[i]=c;
            a=b;
            b=c;
        }
        for (i = 0; i < count; i++){
        System.out.println(sequence[i]);}


    }
}
