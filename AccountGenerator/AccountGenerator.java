import java.util.Random;
import java.util.Scanner;

public class AccountGenerator {
    
    public static void main(String[] args)
    {
        /*Input Processing */
        Scanner kbd = new Scanner(System.in);
        Random randGen = new Random();
        System.out.print("Enter your first name: ");
        String userFirstName = kbd.nextLine();
        System.out.print("Enter your last name: ");
        String userLastName = kbd.nextLine();

        /*Convert uservalues to lower case */
        userFirstName = userFirstName.toLowerCase();
        userLastName = userLastName.toLowerCase();

        /*Grab Specific character from user input */
        char firstLetterOfFirstName = userFirstName.charAt(0);
        String firstFiveOfLastName = userLastName.substring(0 , 5);

        /*Grab random int */
        int myInt = randGen.nextInt(90) + 10;

        /*Output Processing */
        String username = firstLetterOfFirstName + firstFiveOfLastName + myInt;
        System.out.println("Username: " + username);

        kbd.close();
    }
}
