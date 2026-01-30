package loops;
import java.util.Scanner;
public class TimeTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] activities = {"Reading", "Studying", "Gyming", "Working"};
        double[] hours = new double[activities.length];
        double hoursAwake=0;
        for(int i = 0; i < activities.length; i++){
            System.out.println((i+1) + ". How many hours are you " +activities[i] + " ?");
            hours[i] = scanner.nextDouble();
            hoursAwake = hoursAwake + hours[i];
        }
        for( int i = 0 ; i < activities.length; i++){
            System.out.println("You are " + activities[i] + " for" + hours[i] + " hours.");
        }
        if((double) 24 - hoursAwake >= 0){
        System.out.println("Your time left for sleeping is " + ((double) 24 - hoursAwake));}
        else{
            System.out.println("Ho cumetre, cat timp crezi ca ai intr-o zi? 2000 de ore ?");}

    }}