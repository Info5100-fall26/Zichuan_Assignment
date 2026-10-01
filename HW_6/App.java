import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        int x = 10, y = 25;

        System.out.println(Math.max(x,y));
        System.out.println(Math.min(x,y));
        System.out.println(Math.sqrt(y));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any word:");
        long startTime = System.currentTimeMillis();

        String word = scanner.nextLine();
        long endTime = System.currentTimeMillis();

        long reactionTime = (endTime - startTime) / 1000;

        int wordLength = word.length();
        
        if (wordLength == 0){
            System.out.println("You entered an empty line. Please reenter ");
        }
        else if (wordLength <= 5){
            System.out.println("Your word is " + word);
            System.out.println("It is a short word");
            System.out.println("The length of the word is " + wordLength);
            System.out.println("Your reaction time is " + reactionTime + " seconds");
        }
        else if (wordLength <= 10){
            System.out.println("Your word is " + word);
            System.out.println("It is a medium word");
            System.out.println("The length of the word is " + wordLength);
            System.out.println("Your reaction time is " + reactionTime + " seconds");
        }
        else{
            System.out.println("Your word is " + word);
            System.out.println("It is a long word");
            System.out.println("The length of the word is " + wordLength);
            System.out.println("Your reaction time is " + reactionTime + " seconds");
        }

    }
    
}
