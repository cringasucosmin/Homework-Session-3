package EnhancedExercises;
import java.io.File;
import java.util.Random;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
public class RandomExercise {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int RandomDigit = rand.nextInt(10);
        System.out.println(RandomDigit);
        int choice;
        do {
            System.out.println("=== Test Data Generator ===");
            System.out.println("1. Generate Email Address");
            System.out.println("2. Generate Phone Number");
            System.out.println("3. Generate Password");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice=scanner.nextInt();
            if (choice == 1){
               generateEmails(scanner,rand);
            }
            if(choice == 2){
                generatePhones(scanner,rand);}
            if(choice == 3){
                generatePassword(scanner,rand);}
        } while (choice != 4);}

    public static void generateEmails(Scanner scanner, Random rand){
        System.out.println("You chose: Generate Email Adress\n");
        System.out.println("How many E-mails do you need?");
        int count=scanner.nextInt();
        String[] emails= new String[count];
        String[] firstNames = {"john", "mary", "alex", "sarah", "mike"};
        String[] lastNames = {"smith", "jones", "brown", "davis", "wilson"};
        String[] domains = {"gmail", "yahoo", "outlook", "hotmail", "google"};
        String[] extensions = {"com", "net", "org", "ro", "co.uk"};
        try{
            PrintWriter writer = new PrintWriter(new FileWriter("test_emails.txt"));
        for (int i=0; i<count;i++){
            String randomfirstNames=firstNames[rand.nextInt(5)];
            String randomlastNames=lastNames[rand.nextInt(5)];
            String randomDomains=domains[rand.nextInt(5)];
            String randomextensions=extensions[rand.nextInt(5)];
            emails[i]=randomfirstNames + "." + randomlastNames + "@" + randomDomains + "." + randomextensions;
            System.out.println("Random email generated: " +emails[i]);
            writer.println(emails[i]);}
            writer.close();
            System.out.println("\n Emails saved to test_emails.txt!");}
        catch (IOException e){
            System.out.println("Error!");
        }
    }
    public static void generatePhones(Scanner scanner, Random rand){
        System.out.println("You chose: Generate phone number\n");
        System.out.println("How many Phone Numbers do you need?");
        int count=scanner.nextInt();
        try{
            PrintWriter writer = new PrintWriter(new FileWriter("test_phonenumbers.txt"));

        for(int j=0; j<count; j++){
            String phoneNumber = "+407";
            for(int i=0; i<8;i++){
                int digit = rand.nextInt(10);
                phoneNumber=phoneNumber+digit;
            }
            System.out.println(phoneNumber);
            writer.println(phoneNumber);}
            writer.close();
            System.out.println("Phone numbers saved to test_phonenumbers.txt");}
        catch(IOException e){
            System.out.println("Error!");}
    }
    public static void generatePassword(Scanner scanner, Random rand){
            System.out.println("You chose: Generate password\n");
            System.out.println("How many Passwords do you need?");
            int count=scanner.nextInt();
        try{
            PrintWriter writer = new PrintWriter(new FileWriter("test_passwords.txt"));

            for(int j=0; j<count; j++){
                String pool = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
                String password="";
                for(int i=0; i<11; i++){
                    password=password+pool.charAt(rand.nextInt(62));
                }
                System.out.println(password);
                writer.println(password);}
                writer.close();
                System.out.println("Passwords saved to test_passwords.txt");}
        catch(IOException e){
            System.out.println("Error");}
    }}


