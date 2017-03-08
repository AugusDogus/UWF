import java.util.Scanner;

public class workshopFour
{

    private static final double METS_MOWING_LAWN = 5.5;
    private static final double METS_WEEDING_GARDEN = 4.5;
    private static final double METS_CODING_JAVA = 1.5;
    private static final double METS_HOME_MOVIE = 1.3;
    private static final double METS_LUNCH_WALK = 3.5;

    private static final int MINUTES_PER_HOUR = 60;
    private static final double KILO_FACTOR = 2.2;

    private static final double CONSTANT_FACTOR = 0.0175;

    public static void main(String[] args)
    {

        System.out.println("Welcome to the calories burned calculator!");

        System.out.printf("Please type your name: ");
        Scanner keyboard = new Scanner(System.in);
        String name = keyboard.nextLine();

        System.out.printf("Please enter your weight: ");
        double weight = keyboard.nextDouble();

        System.out.printf("Please enter hours spent mowing the lawn per week: ");
        double hoursSpentMowingTheLawnPerWeek = keyboard.nextDouble();

        System.out.printf("Please enter hours spent weeding the garden per week: ");
        double hoursSpentWeedingTheGardenPerWeek = keyboard.nextDouble();

        System.out.printf("Please enter hours spent writing Java code per week: ");
        double hoursSpentWritingJavaCode = keyboard.nextDouble();

        System.out.printf("Please enter hours spent watching Turner Classic Movies per week: ");
        double hoursSpentWatchingTurnerClassicMoviesPerWeek = keyboard.nextDouble();

        System.out.printf("Please enter hours spent taking a lunchtime walk per week: ");
        double hoursSpentTakingALunchtimeWalkPerWeek = keyboard.nextDouble();

        double weightInKiloGrams = weight / KILO_FACTOR;
        int lawnMinutes = ConvertHoursToMinutes(hoursSpentMowingTheLawnPerWeek);
        int gardenMinutes = ConvertHoursToMinutes(hoursSpentWeedingTheGardenPerWeek);
        int javaMinutes = ConvertHoursToMinutes(hoursSpentWritingJavaCode);
        int movieMinutes = ConvertHoursToMinutes(hoursSpentWatchingTurnerClassicMoviesPerWeek);
        int lunchMinutes = ConvertHoursToMinutes(hoursSpentTakingALunchtimeWalkPerWeek);

        double caloriesBurnedLawn = caloriesBurned(METS_MOWING_LAWN, weightInKiloGrams, lawnMinutes);
        double caloriesBurnedGarden = caloriesBurned(METS_WEEDING_GARDEN, weightInKiloGrams, gardenMinutes);
        double caloriesBurnedJava = caloriesBurned(METS_CODING_JAVA, weightInKiloGrams, javaMinutes);
        double caloriesBurnedMovie = caloriesBurned(METS_HOME_MOVIE, weightInKiloGrams, movieMinutes);
        double caloriesBurnedLunch = caloriesBurned(METS_LUNCH_WALK, weightInKiloGrams, lunchMinutes);

        double totalCaloriesBurned = caloriesBurnedLawn + caloriesBurnedGarden + caloriesBurnedJava + caloriesBurnedMovie + caloriesBurnedLunch;

        System.out.printf("%s burned an estimated %.2f calories mowing the lawn. %n", name, caloriesBurnedLawn);
        System.out.printf("%s burned an estimated %.2f calories weeding the garden. %n", name, caloriesBurnedGarden);
        System.out.printf("%s burned an estimated %.2f calories writing Java code. %n", name, caloriesBurnedJava);
        System.out.printf("%s burned an estimated %.2f calories watching Turner Classic Movies. %n", name, caloriesBurnedMovie);
        System.out.printf("%s burned an estimated %.2f calories taking a lunchtime walk. %n", name, caloriesBurnedLunch);

        System.out.printf("%s expended a total of: %.2f calories. %n", name, totalCaloriesBurned);

    }

    private static double caloriesBurned(double Mets, double Weight, double Minutes)
    {
        return ((CONSTANT_FACTOR) * Mets * Weight * Minutes);
    }

    private static int ConvertHoursToMinutes(double hrs)
    {
        return (int) (hrs * MINUTES_PER_HOUR);
    }

}