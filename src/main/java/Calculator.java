import java.util.Scanner; // 1. Importăm unealta

public class Calculator {
    public static void main(String[] args) {
    // 2. Creăm obiectul Scanner conectat la tastatură (System.in)
    Scanner scanner = new  Scanner(System.in);


    System.out.print("Primul numar = ");
    double primulNr = scanner.nextDouble();
    System.out.println( "Al doilea numar = ");
    double aldoileaNr = scanner.nextDouble();
    System.out.println("+, -, *, / ");
    char x=scanner.next().charAt(0);

    double result =0;
    if (x == '+'){
        result = primulNr + aldoileaNr;
    }
    if (x == '-'){
        result = primulNr - aldoileaNr;
    }
    if (x == '*'){
        result = primulNr * aldoileaNr;
    }
    if (x == '/'){
            result = primulNr / aldoileaNr;
        }
    System.out.println(result);


}
}