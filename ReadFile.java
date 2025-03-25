import java.io.*;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for filename
        System.out.print("Enter the filename to read: ");
        String str = sc.nextLine();

        try {
            // Create FileReader and wrap it with BufferedReader
            FileReader fr = new FileReader(str);
            BufferedReader br = new BufferedReader(fr);

            String line;
            System.out.println("\nFile Contents:");
            // Read file line by line
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            // Close resources
            br.close();
            fr.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found: " + str);
        }
        catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        finally {

            sc.close();
        }
    }
}
/*
I/P-
Enter the filename to read: README.md
O/P-
File Contents:
# java-class-object
 */