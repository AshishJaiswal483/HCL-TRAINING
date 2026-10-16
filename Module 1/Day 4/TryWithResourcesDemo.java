import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesDemo {
    public static void main(String[] args) {
        try (BufferedReader br =new BufferedReader(new FileReader("Data.txt"))) {

            String line;

          while ((line = br.readLine()) != null) {
                System.out.println("File content: " + line);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program finished.");
    }
}
