package loops;
import java.util.Scanner;
import org.w3c.dom.ls.LSOutput;

public class MethodsPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        sayHello();
        int answer = multiply(5, 3);
        System.out.println("5 * 3 = " + answer);
        System.out.println("Tell me how many numbers you want to introduce");
        int n= scanner.nextInt();
        int[] scores= new int[n];
        for(int i=0; i < n; i++){
        scores[i]= scanner.nextInt();
        }

        int highest = findMax(scores);
        int lowest = findMin(scores);
        double average = average(scores);
        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);
        System.out.println("The average of the scores is " + average);
    }

        public static void sayHello () {
            System.out.println("Hello from the method!");
        }

        public static int multiply ( int x, int y){
            int result = x * y;
            return result;
        }
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static int findMin(int[] arr){
        int min = arr[0];
        for (int i=0; i<arr.length; i++){
            if (arr[i] < min){
                min=arr[i];
            }
        }
    return min;
    }
    public static double average(int[] arr){
        int sum=0;
        for(int i=0; i < arr.length; i++){
            sum = sum+arr[i];
        }
        return ((double) sum / arr.length);
    }

}


