public class Pyramid{
    public static void main(String[] args)
    {
        int numBlocks = 1000000;
        final double blockWeight = 2.5;
        double pyramidWeight = numBlocks * blockWeight;
        System.out.println("The pyramid has " + numBlocks + " blocks and weighs " + pyramidWeight + " tons.");
    }
}
