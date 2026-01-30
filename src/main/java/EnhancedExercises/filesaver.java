package EnhancedExercises;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class filesaver {
    public static void main(String[] args) {

        try {
            PrintWriter writer = new PrintWriter(new FileWriter("myfile.txt"));
            writer.println("Hello from Java!");
            writer.println("This is line 2");
            writer.close();  // IMPORTANT! Always close when done!
            System.out.println("File created successfully!");
        } catch (IOException e) {
            System.out.println("Error creating file!");
        }
}
}
