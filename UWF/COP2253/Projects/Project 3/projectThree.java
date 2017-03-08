import java.util.Scanner;

/**

 This program simulates a game of stones.

 @author Augie Luebbers

 @version 1.0

 COP2253    Project 3

 File Name: projectThree.java

 */

public class projectThree {

    public static Scanner keyboard = new Scanner(System.in);
    public static String name;

    public static int humanDice;
    public static int computerDice;
    public static int stones;

    public static void main(String[] args) {
        gameSetup();
        humanDice = rollDice();
        computerDice = rollDice();

        //If the dice roll happens to be the same, default to letting the human go first.
        if (humanDice == computerDice) {
            humanDice++;
        }

        System.out.println("\nWe are now going to roll the dice to see who goes first. Since I have the dice, I am going to roll for both of us and I am going to roll for you first. \nHere goes, you just rolled a " + humanDice + ". Now, I am going to roll for myself. I just rolled a " + computerDice);

        if (humanDice > computerDice) {
            System.out.println("You go first.");
            playGame("human");
        } else {
            System.out.println("I'll go first.");
            playGame("computer");
        }
    }

    public static void gameSetup(){
        System.out.println("Hello, my name is Jarvis, what is yours?");
        name = keyboard.nextLine();
        System.out.println("\nWelcome " + name + ", let's play a game. We are going to imagine a pile of stones on the floor between us. \nOne of us will select the number of stones that the pile contains, a number between 10 and 50. \nThen, we will each take turns removing a set of stones from the pile until one of us takes the final stone. \nThe player who takes the final stone wins the game. \nThe player who goes first gets to select the number of stones that I will place in the pile. \nWe will determine which one of us plays first with two rolls of the dice and whoever gets the highest number for their roll gets to play first.");
    }

    public static int rollDice(){
        int firstRoll = (int) (Math.random() * 6) + 1;
        int secondRoll = (int) (Math.random() * 6) + 1;
        return firstRoll + secondRoll;
    }

    public static void playGame(String player) {
        do {
            if (player.equals("human")) {
                System.out.println("How many stones, between 10 and 50, would you like to have in the pile?");
                stones = keyboard.nextInt();
                System.out.println("Excellent " + name + ", we now have a pile of " + stones + " stones between us");

                do {
                    humanTurn();
                    computerTurn();
                    if (stones != 0) {
                        System.out.println("The pile now has " + stones + " stones remaining.");
                    }
                } while (stones > 0);

            } else {
                System.out.println("I will choose how many stones are in the pile.");
                stones = (int) (Math.random() * 50) + 10;
                System.out.println("We now have a pile of " + stones + " stones between us");

                do {
                    computerTurn();
                    humanTurn();
                    if (stones != 0) {
                        System.out.println("The pile now has " + stones + " stones remaining.");
                    }
                } while (stones > 0);
            }
        } while (playAgain());
    }

    public static void humanTurn(){
        if (stones != 0) {
            System.out.println("\nHow many stones (between 1 and 3) would you like to remove from the pile?");
            stones = stones - keyboard.nextInt();
        } else {
            System.out.println("I won!");
        }
    }

    public static void computerTurn(){
        if (stones != 0) {
            int computerChoice = (int) (Math.random() * 3) + 1;
            System.out.println("I will now remove " + computerChoice + " stones.");
            stones = stones - computerChoice;
        } else {
            System.out.println("You won!");
        }
    }

    public static boolean playAgain() {
        System.out.println("Play again? y/n");
        String answer = keyboard.nextLine();
        if (answer.equals("y")){
            return true;
        } else {
            return false;
        }
    }
}
