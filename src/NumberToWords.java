public class NumberToWords
{
    public static String numberToWords(int number)
    {

number = reverse(number);
        int tempNum = 0;

        String strNum = "";

        if(number > 0)
        {
            while(number > 0)
            {
                tempNum = number % 10;
                switch (tempNum)
                {
                    case 0:
                        System.out.println("Zero");
                        strNum += "Zero ";
                        break;
                    case 1:
                        System.out.println("One");
                        strNum += "One ";
                        break;
                    case 2:
                        System.out.println("Two");
                        strNum += "Two ";
                        break;
                    case 3:
                        System.out.println("Three");
                        strNum += "Three ";
                        break;
                    case 4:
                        System.out.println("Four");
                        strNum += "Four ";
                        break;
                    case 5:
                        System.out.println("Five");
                        strNum += "Five ";
                        break;
                    case 6:
                        System.out.println("Six");
                        strNum += "Six ";
                        break;
                    case 7:
                        System.out.println("Seven");
                        strNum += "Seven ";
                        break;
                    case 8:
                        System.out.println("Eight");
                        strNum += "Eight ";
                        break;
                    case 9:
                        System.out.println("Nine");
                        strNum += "Nine ";
                        break;
                    default:
                        System.out.println("Error");
                }
                number = number / 10;
            }
            System.out.println(strNum);
           return strNum;
        }
        else
        {
            System.out.println("Invalid Value");
            return "Invalid Value";
        }
    }

    public static int reverse(int number)
    {
        int origNumDigits = String.valueOf(number).length();
        int reversedNumDigits = 0;

        int reversed = 0;

        while(number>0)
        {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        reversedNumDigits = String.valueOf(reversed).length();
        System.out.println("Original Num of Digits: "+origNumDigits);
        System.out.println("Reversed Num of Digits: "+reversedNumDigits);
        System.out.println("Reversed Number = " + reversed);
        return reversed;
    }

    public static int getDigitCount(int number)
    {
        if(number >=0 )
        {
            int numDigits = String.valueOf(number).length();
        System.out.println(numDigits);
            return numDigits;
        }
        else
            {
                System.out.println("Error: Negative Number");
               return -1;
            }
    }
    

}
