import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class schimbValutar {
    public static void main(String[] args) {

        // 2. Creăm obiectul Scanner conectat la tastatură (System.in)
        Scanner CURS_EUR = new Scanner(System.in);
        Scanner RON = new Scanner(System.in);
        System.out.print("Curs valutar eur = ");
        double CURSEURO = CURS_EUR.nextDouble();
        System.out.print(" Suma de bani in lei = ");
        double VALOARERON = RON.nextDouble();

        System.out.println("Suma de bani in euro = " + (VALOARERON / CURSEURO));
    }



}
