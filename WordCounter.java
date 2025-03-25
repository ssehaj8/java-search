import java.io.*;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the filename from the user
        System.out.print("Enter the filename: ");
        String str = sc.nextLine();

        // Get the word to search from the user
        System.out.print("Enter the word to search: ");
        String searchWord = sc.nextLine();

        int wordCounter = 0;

        try {
            // Create FileReader and wrap it with BufferedReader
            FileReader fr = new FileReader(str);
            BufferedReader br = new BufferedReader(fr);

            String line;
            System.out.println("\nReading file contents...");

            // Read file line by line
            while ((line = br.readLine()) != null) {
                // Remove punctuation and convert to lowercase for better matching
                line = line.replaceAll("[^a-zA-Z ]", "").toLowerCase();

                // Split line into words and check occurrences
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.equals(searchWord.toLowerCase())) {
                        wordCounter++;
                    }
                }
            }

            // Close resources
            br.close();
            fr.close();

            // Display the result
            System.out.println("\nThe word '" + searchWord + "' appears " + wordCounter + " times in the file.");
        }
        catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }
        catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        finally {
            // Close scanner
            sc.close();
        }
    }
}
/*
I/O-
Enter the filename: README.md
Enter the word to search: java
O/P-

Reading file contents...

The word 'java' appears 0 times in the file.
 */