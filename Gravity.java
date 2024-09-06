public class Gravity{
    public static void main(String[] args)
    {
        final double g = 9.8;
        final int t = 23;
        double height = 0.5 * g * t * t;
        double velocity = g * t;
        System.out.println("The height of the cliff is " + height + " meters.");
        System.out.println("The velocity of the ball is " + velocity + " m/s.");

    }
}
