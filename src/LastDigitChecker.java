public class LastDigitChecker
{
    public static boolean hasSameLastDigit(int num1, int num2, int num3)
    {
        int num1LastDigit, num2LastDigit, num3LastDigit;

        if(num1 >= 10 && num1 <= 1000
                && num2 >= 10 && num2 <= 1000
                && num3 >= 10 && num3 <= 1000)
        {
            num1LastDigit = num1 % 10;
            num2LastDigit = num2 % 10;
            num3LastDigit = num3 % 10;

            if(num1LastDigit == num2LastDigit || num1LastDigit == num3LastDigit )
            {
                System.out.println("True");
                return true;
            }
            else if(num2LastDigit == num3LastDigit)
            {
                System.out.println("True");
                return true;
            }
            else
            {
                System.out.println("False");
                return false;
            }

        }
        else
            {
                System.out.println("Error");
                return false;
            }
    }

    public static boolean isValid(int num)
    {
        if(num >= 10 && num <= 1000)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
