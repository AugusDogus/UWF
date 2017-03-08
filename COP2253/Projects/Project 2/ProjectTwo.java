import java.util.Scanner;

/**
 This program creates a dynamic story
 that is powered by user input.
 (That's the dynamic part)
 (The story is actually static)

 REM Certain IDE's do not recognize the charset that the heart (♥ located on line 76) is in.

 @author Augie Luebbers
 @version 1.0

 COP2253    Project 2
 File Name: ProjectTwo.java
 */

public class ProjectTwo {

    // Declare variables
    private static String name;
    private static String job;
    private static String petName;

    private static int age;
    private static double vehicleCost;

    private static final double SALES_TAX = 7.5;

    // Instantiate objects
    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        getUserInput();
        formatInput();
        story();
    }

    private static void print(String input) {
        System.out.println(input);
    }

    private static void getUserInput() {
        print("What is your first name?");
        name = keyboard.next();

        print("What is your last name?");
        name = name + " " + keyboard.next();

        print("What is your age?");
        age = keyboard.nextInt();

        print("What is your profession or expected profession?");
        job = keyboard.next();

        print("What was the cost of your first vehicle?");
        vehicleCost = keyboard.nextDouble();

        print("What is the name of your favorite pet?");
        petName = keyboard.next();
    }

    private static void formatInput() {
        job = job.toUpperCase();
        petName = petName.toLowerCase();
        vehicleCost = vehicleCost + (vehicleCost * (SALES_TAX / 100) );
    }

    private static void story() {
        print("");
        print("");
        print("");
        print("");

        String story = (" " + name + " was an incredible person. \n They had many adventures riding around on their favorite vehicle \n (an old trashcan lid that only set them back $%.2f!) \n that had '" + splitName('l') + " ♥ " + petName + "' engraved on it. \n Because they enjoyed their profession working as a " + job + " so much, \n they were able to put in a consistent 168 hours a week! Who cares about sleeping? \n Perhaps " + splitName('f') + " will actually go into space one day, \n only the future knows what their next adventure will be! \n They've only just been around the sun " + age + " times!");
        System.out.printf(story, vehicleCost);


        print("");
        print("");
        print(" The above story had " + story.length() + " characters in it.");
    }

    private static String splitName(char letter) {
        if (letter == 'f') {
            return name.substring(0, name.indexOf(' '));
        } else if (letter == 'l') {
            return name.substring(name.lastIndexOf(' ') + 1, name.length());
        } else {
            return null;
        }
    }

}