import java.util.Scanner; // 1. Importăm unealta

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        System.out.println("Enter how many KW you consumed");
        double KW= scanner.nextDouble();
        double bill = 0;
        if (KW <= 100){
            bill = 0.5 * KW;
            System.out.println("Valoarea facturii este: " +bill);
        }
        if ((KW <= 200) && (KW > 100)){
            bill = 50 + ((KW - 100) * 0.75);
            System.out.println("Valoarea facturii este de " + bill);
        }
        if (KW >200)  {
            bill = 50 + 75 + (KW - 200);
            System.out.println("Valoarea facturii este de " + bill);
        }

    }
    }