public class NumberPalindrome
{
    public static boolean isPalindrome(int number)
    {
        int reverse = 0;
        int lastDigit = 0;

        if(number < 0)
        {
            number = -number;
        }

        int tempNumber = number;

        while(tempNumber > 0)
        {
            lastDigit = tempNumber % 10;
            reverse = reverse * 10;
            reverse += lastDigit;

//            System.out.println("Last Digit is: " + lastDigit);
//            System.out.println("Reverse is: " + reverse);
//            System.out.println("Temp Number is: " + tempNumber);

            tempNumber = tempNumber / 10;
        }

        if(number == reverse)
        {
            System.out.println("Number is a palindrome");
            return true;
        }
        else
            {
                System.out.println("Number is not a palindrome");
               return false;
            }
    }
}
