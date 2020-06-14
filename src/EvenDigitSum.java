public class EvenDigitSum
{
    public static int getEvenDigitSum(int number)
    {
        int sum = 0;
        int lastDigit;

        if(number >= 0)
        {
            while(number > 0)
            {
                lastDigit = number % 10;
                if(lastDigit % 2 ==0)
                {
                    sum += lastDigit;
                }
                number = number / 10;
            }
            System.out.println("Sum of Even Digits = " + sum);
            return sum;

        }
        else
        {
            System.out.println("Error");
            return -1;
        }
    }
}
