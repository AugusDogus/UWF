/**
 A named Door can be opened or closed
 @author Augie Luebbers
 @version 1.0

 COP2253	Project #: 1
 File Name: Automobile.java
 */


public class Automobile {

    private String make;

    private String model;

    private double price;

    public Automobile() {
        make = "";
        model = "";
        price = 0.0;
    }

    public Automobile(String initMake, String initModel, double initPrice) {
        make = initMake;
        model = initModel;
        price = initPrice;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public void setMake(String newMake) {
        make = newMake;
    }

    public void setModel(String newModel) {
        model = newModel;
    }

    public void setPrice(double newPrice) {
        price = newPrice;
    }
}