public class Workshop3{

    public static void main(String[] args)
    {
        double distance = 6.21;
        double time = 35.5;
        double pace;

        System.out.println("This program calculates your pace given a time and distance traveled.");

        //Calculate pace.
        pace =  time/distance;

        //Use print instead of print so that we can
        System.out.print("Your pace is ");
        System.out.printf("%.2f", pace);
        System.out.print(" minutes per mile.");

    }

}