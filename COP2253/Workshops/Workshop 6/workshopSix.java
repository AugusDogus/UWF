import java.util.Random;
import java.util.Scanner;

    /**

        This program simulates the game of Craps.

        @author Augie Luebbers

        @version 1.0

        COP2253    Workshop 6

        File Name: workshopSix.java

    */

public class workshopSix {

    public static boolean playAgain;
    public static String answer;

    public static void main(String[] args) {

        do {
            playGame();
            playAgain = promptUser();
        } while(playAgain);

    }

    public static void playGame() {
        int sevens = 0;
        int elevens = 0;

        for (int i = 0; i < 101; i++) {

            int diceSum = rollDice() + rollDice();
            if (diceSum == 7) {
                sevens++;
            } else if (diceSum == 11) {
                elevens++;
            }
        }

        System.out.println("The player rolled " + sevens + " sevens and " + elevens + " elevens for a total of " + (sevens + elevens) + " wins out of 100.");

    }

    public static int rollDice() {
        Random rand = new Random();
        int number = rand.nextInt((6 - 1) + 1) + 1;;
        return number;
    }

    public static boolean promptUser() {
        boolean eval = false;
        boolean incorrectInput = true;

        Scanner keyboard = new Scanner(System.in);

        while (incorrectInput) {

            System.out.println("Play again? y/n");
            answer = keyboard.nextLine();

            if (answer.equals("y")) {
                eval = true;
                incorrectInput = false;
            } else if (answer.equals("n")) {
                eval = false;
                incorrectInput = false;
            } else {
                eval = false;
                incorrectInput = true;
            }
        }

        return eval;
    }

}
