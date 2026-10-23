import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        try {
            File myObj = new File("my_test_file.txt");
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }

            myReader.close();

            Scanner input = new Scanner(System.in);

            System.out.println("Enter a phrase:");
            String phrase = input.nextLine();

            System.out.println("You entered: " + phrase); 

            FileWriter myWriter = new FileWriter("my_test_file.txt");
            myWriter.write(phrase);
            myWriter.close();

            System.out.println("Successfully wrote to the file.");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
