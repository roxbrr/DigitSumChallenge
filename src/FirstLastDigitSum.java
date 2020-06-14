public class FirstLastDigitSum
{
    public static int sumFirstAndLastDigit(int number)
    {
        int firstDigit = number;
        int lastDigit = number % 10;

        if(number >= 0)
        {
            while(firstDigit >= 10)
            {
                firstDigit /= 10;
            }
//            System.out.println("First Digit: "+ firstDigit);
//            System.out.println("Last Digit: "+ lastDigit);
            System.out.println("Digit Sum = " + (firstDigit+lastDigit));
            return firstDigit+lastDigit;
        }
        else
        {
            System.out.println("Error");
            return -1;
        }
    }
}
