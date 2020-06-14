public class GreatestCommonDivisor
{
    public static int getGreatestCommonDivisor(int first, int second)
    {

        int greatestCommonDivisor = 0;

        if(first >= 10 && second >= 10)
        {
            for(int i = 1; i <= first && i <= second; i++)
            {
                if(first % i == 0 && second % i == 0)
                {
                    greatestCommonDivisor = i;
//                    System.out.println("GCF = " + i);
                }
                else
                {
//                    System.out.println(i + " is not a common divisor");
                }
            }
            System.out.println(greatestCommonDivisor);
            return greatestCommonDivisor;
        }
        else
        {
            System.out.println("Error");
            return -1;
        }
    }
}
