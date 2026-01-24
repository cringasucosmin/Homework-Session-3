package loops;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

//Password checker 3 times X
//do while for loop learning
public class ForLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String parola = "123asd";
        int count;
        for (count = 1; count <= 3; count++) {
            System.out.println("Type in the password: ");
            String verificare = scanner.nextLine();
            if (parola.equals(verificare)) {
                System.out.println("Password is correct!");
                break;
            } else {
                System.out.println("Attempt " + count + ": Wrong Password");
            }
        }
        if (count == 4){
            System.out.println("This account has been locked");
        }

    }
}