import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ){
        Scanner in = new Scanner(System.in);
        String userInput;

        System.out.println("What is your name?");

        userInput = in.nextLine();

        if (userInput.equalsIgnoreCase("Alice")) {
            System.out.println("Hi" + " " + userInput);
        } else if (userInput.equalsIgnoreCase("Bob")) {
            System.out.println("Hi" + " " + userInput);
        } else {
            System.out.println("Incorrect username");
        }

    }
}
