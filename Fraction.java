public class Fraction{
    public static void main(String[] args)
    {
        int num1 = 1;
        int den1 = 3;
        int num2 = 1;
        int den2 = 3;
        int denominatornum = den1 * den2; 
        int numeratornum = num1*den2 + num2*den1;
        
        System.out.println("The first numerator is " + num1 + ".");
        System.out.println("The first denominator is " + den1 + ".");
        System.out.println("The second numerator is " + num2 + ".'");
        System.out.println("The second denominator is " + den2 + ".");
        System.out.println("The sum of " + num1 + "/" + den1 + " + " + num2 + "/" + den2 + " = " + numeratornum + "/" + denominatornum + ".");

    }
}