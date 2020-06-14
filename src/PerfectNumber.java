public class PerfectNumber
{
    public static boolean isPerfectNumber(int number)
    {
        int sum = 0;

        if(number > 0)
        {
            for(int i=1; i<number; i++)
            {
                if(number % i == 0)
                {
                    sum += i;
                }
            }
            if(sum == number)
            {
                System.out.println("True");
                return true;
            }
            else
                {
                    System.out.println("Error: Sum != number");
                return false;
                }
        }
        else
        {
            System.out.println("Error: Number out of range");
            return false;
        }
    }
}
