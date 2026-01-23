import java.util.Scanner;
public class Temperatura {
    public static void main(String[] args) {
    Scanner scanner = new  Scanner(System.in);

    System.out.println("What is the temperature you want to convert?");
    double x = scanner.nextDouble();

    scanner.nextLine();
    System.out.println("What is the type of conversion you need ? ( C to F / F to C)");
    String type =scanner.nextLine();
    double result = 0;

    if (type .equals("C to F")){
        result = ((x * 9.0/5.0) +32);
    }
    if (type .equals("F to C")){
        result = (x - 32) * 5.0/9.0;
    }
        System.out.println(result);
    scanner.close();
    }
}
