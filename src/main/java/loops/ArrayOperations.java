package loops;
import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] testScores = {85, 92, 78, 95, 88};
        int max = testScores[0];
        int maxIndex=0;
        for (int i = 0; i < testScores.length; i++) {
            if (testScores[i] > max) {
                max = testScores[i];
                maxIndex = i;}}
        System.out.println("Highest score: " + max + " which belongs to the Student number " + (maxIndex +1) );
        int minIndex=0;
        int min = testScores[0];
        for (int i = 1; i < testScores.length; i++) {  // Notice: starting at i=1 this time!
            if (testScores[i] < min) {
                min = testScores[i];
                minIndex = i;}}
        System.out.println("Lowest score: " + min + " which belongs to the Student number " + (minIndex +1) );

        int searchValue = 78;
        boolean found = false;
        for( int i = 0 ; i < testScores.length; i++){
            if (searchValue == testScores[i])
            {   found = true;
                break;}}
            if (found) {
                System.out.println(searchValue + " was found!");
            } else {
                System.out.println(searchValue + " was not found!");
            }

        int total =0;
            for ( int i=0; i< testScores.length; i++) {
                total = total + testScores[i];
            }
        double average = (double) total / testScores.length;
        System.out.println("Average score: " + average);
        int counter=0;
        for (int i = 0; i < testScores.length; i++){
            if( testScores[i] > average){
                System.out.println( "The student with number " + (i+1) + " scored above average");
                counter++;
            }
        }
        System.out.println("There were " + counter + " students that scored above average");
    }}