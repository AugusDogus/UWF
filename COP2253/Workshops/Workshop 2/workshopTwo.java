/**
<pre>
This program calculates the amount of energy expended
using the concept of metabolic equivalents.  
The formula used is 
Calories/Minute = 0.0175 * MET * WeightInKilos 
One Kg = 2.2 Pounds

@author Augie Luebbers
@version 1.0

COP2253    Workshop 2
File Name: Calories.java
</pre>
*/

public class workshopTwo 
{
   //Declare our contant variables for METS
   private static final int METS_RUNNING_6MPH = 10;
   private static final int METS_BASKETBALL = 8;
   private static final int METS_SLEEPING = 1;
   
   //Declare our other constants
   private static final double CONSTANT_FACTOR = 0.0175;
   private static final double KILO_FACTOR = 2.2;
  
   public static void main(String[] args)
   {
      //Declare input variables
      String inputName = "Augie";
      int inputWeight = 300;        //300 lbs
      int inputRunningTime = 30;    //30 minutes
      int inputBasketballTime = 60; //1 hour * 60 minutes = 480
      int inputSleepingTime = 480;  //8 hours * 60 minutes = 480
      
      //Calculate weight from lbs -> kg
      double weightInKiloGrams = inputWeight / KILO_FACTOR;
      
      //Calculate calories burned during specific activities using included calories burned method by Steve Satterfield
      double caloriesBurnedRunning = caloriesBurned(METS_RUNNING_6MPH, weightInKiloGrams, inputRunningTime);
      double caloriesBurnedBasketballing = caloriesBurned(METS_BASKETBALL, weightInKiloGrams, inputBasketballTime);
      double caloriesBurnedSleeping = caloriesBurned(METS_SLEEPING, weightInKiloGrams, inputSleepingTime);
      
      //Calculate the sum of all calories burned
      double caloriesSum = caloriesBurnedRunning + caloriesBurnedBasketballing + caloriesBurnedSleeping;
      
      //Displaying introduction
      System.out.println();
      System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
      System.out.println("Welcome to the calorie counter.");
      System.out.println("This program with calculate calories burned for Augie who weighs 300 pounds.");
      System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
            
      /*
      ** Ascii art gemerated using http://patorjk.com/software/taag/#p=display&f=Graffiti&t=Type%20Something%20
      ** Automated escaping characters using http://www.freeformatter.com/java-dotnet-escape.html  
      */
      
      //Displaying calculating text for ui purposes
      System.out.println();
      System.out.println("   _____      _            _       _   _             ");
      System.out.println("  / ____|    | |          | |     | | (_)            ");
      System.out.println(" | |     __ _| | ___ _   _| | __ _| |_ _ _ __   __ _ ");
      System.out.println(" | |    / _` | |/ __| | | | |/ _` | __| | '_ \\ / _` |");
      System.out.println(" | |___| (_| | | (__| |_| | | (_| | |_| | | | | (_| |  _   _   _");
      System.out.println("  \\_____\\__,_|_|\\___|\\__,_|_|\\__,_|\\__|_|_| |_|\\__, | (_) (_) (_)");
      System.out.println("                                                __/ |");
      System.out.println("                                               |___/ ");
  
      //Displaying results
      System.out.println();
      System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
      System.out.println(inputName + " burned an estimated " + caloriesBurnedRunning + "  calories running.");
      System.out.println(inputName + " burned an estimated " + caloriesBurnedBasketballing + " calories playing basketball.");
      System.out.println(inputName + " burned an estimated " + caloriesBurnedSleeping + " calories sleeping.");
      System.out.println(inputName + " burned an estimated " + caloriesSum + "  total calories.");      
      System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
     
   }
   
   /**
      This method accepts as input the integer METS value for a specific activity, the double
      weight value for the person involved in the activity, and the number of minutes that the
      activity was sustained. This method then returns the approximate number of calories that
      person burned during the activity.
      
      @author Steve Satterfield
   */
   private static double caloriesBurned(int Mets, double Weight, int Minutes)
   {
      return ((CONSTANT_FACTOR) * Mets * Weight * Minutes);
   }
   
}         
      
      
      
