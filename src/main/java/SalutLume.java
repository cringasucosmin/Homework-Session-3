import java.sql.SQLOutput;

public class SalutLume {
    public static double sum(double nr1, double nr2){
        return nr1 + nr2;
    }

    public static void main(String[] args) {

        System.out.println("Salut, Lume! Primul meu program cu Gradle!");

        int varsta = 33;
        System.out.println("1. Varsta mea este "  + varsta);

        double suma = sum(1, 5);
        System.out.println("Suma calculata cu ajutorul functiei sum() " + suma);

        //Examples for logic arguments "AND" ( && )

        boolean esteMajor= true;
        boolean areBuletinul = true;
        boolean poateVota = esteMajor && areBuletinul;

        System.out.println("Poate vota? " + poateVota);

        //Examples for logic argument "OR" ( || )

        boolean mergLaMare=false;
        boolean mergLaMunte=true;

        boolean maDistrez = mergLaMare || mergLaMunte;

        System.out.println("Ma distrez: " + maDistrez);

        //Example for the logical arguments negate ( ! )
        boolean negatieMaDistrez = !maDistrez;

        System.out.println("Afisam rezultatul negat al lui ma distrez: " + negatieMaDistrez);



    }
}

