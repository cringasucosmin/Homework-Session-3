import java.util.Scanner; // 1. Importăm unealta

public class Calculator {
    public static void main(String[] args) {
    // 2. Creăm obiectul Scanner conectat la tastatură (System.in)
    Scanner firstNr = new Scanner(System.in);
    Scanner secondNr = new Scanner(System.in);

    System.out.print("Primul numar = ");
    double primulNr = firstNr.nextDouble();
    System.out.println( "Al doilea numar = ");
    double aldoileaNr = secondNr.nextDouble();

    System.out.println("Suma numerelor este = " + (primulNr + aldoileaNr));

    secondNr.close();
    firstNr.close();
}
}