/**
 A class to test the Automobile class.
 @author Augie Luebbers
 @version 1.0

 COP2253	Workshop 7
 File Name: AutomobileTest.java
 */

public class AutomobileTest
{

    public static void main(String[] args)
    {

        //Create new Car of type Automobile
        Automobile Car = new Automobile();
        //Set up the car.
        setupCar(Car);
        //Output all the variables that live inside 'Car' by using accessor methods that live in it.
        System.out.println("The " + Car.getMake() + " " + Car.getModel() + " costs " + String.valueOf(Car.getPrice()) );

        //The same as line 20, but this time for a Truck of type Automobile using the parameter based constructor.
        Automobile Truck = new Automobile("Suzuki", "Samurai", 4000.50);
        System.out.println("The " + Truck.getMake() + " " + Truck.getModel() + " costs " + String.valueOf(Truck.getPrice()) );

    }

    private static void setupCar(Automobile Car)
    {
        //Use mutator methods to set the make, model, and price using arguments.
        Car.setMake("Honda");
        Car.setModel("Civic");
        Car.setPrice(900.00);
    }
}
