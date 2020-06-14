public class Main
{
    public static void main(String[] args)
    {
//        sumDigits(125);
//        sumDigits(-125);
//        sumDigits(4);
//        sumDigits(32123);

//        NumberPalindrome.isPalindrome(-1221);
//        NumberPalindrome.isPalindrome(707);
//        NumberPalindrome.isPalindrome(11212);

//        FirstLastDigitSum.sumFirstAndLastDigit(252);
//        FirstLastDigitSum.sumFirstAndLastDigit(257);
//        FirstLastDigitSum.sumFirstAndLastDigit(0);
//        FirstLastDigitSum.sumFirstAndLastDigit(5);
//        FirstLastDigitSum.sumFirstAndLastDigit(-10);

//        EvenDigitSum.getEvenDigitSum(123456789);
//        EvenDigitSum.getEvenDigitSum(252);
//        EvenDigitSum.getEvenDigitSum(-22);

//        SharedDigit.hasSharedDigit(12,23);
//        SharedDigit.hasSharedDigit(9,99);
//        SharedDigit.hasSharedDigit(15,55);

//        LastDigitChecker.hasSameLastDigit(41,22,71);
//        LastDigitChecker.hasSameLastDigit(23,32,42);
//        LastDigitChecker.hasSameLastDigit(9,99,999);

//        GreatestCommonDivisor.getGreatestCommonDivisor(25, 15);
//        GreatestCommonDivisor.getGreatestCommonDivisor(12, 30);
//        GreatestCommonDivisor.getGreatestCommonDivisor(9, 18);
//        GreatestCommonDivisor.getGreatestCommonDivisor(10, 35);

        //Factor Printer
//        FactorPrinter.printFactors(6);
//        FactorPrinter.printFactors(32);
//        FactorPrinter.printFactors(10);
//        FactorPrinter.printFactors(-1);

        //PerfectNumber
//        PerfectNumber.isPerfectNumber(6);
//        PerfectNumber.isPerfectNumber(28);
//        PerfectNumber.isPerfectNumber(5);
//        PerfectNumber.isPerfectNumber(-1);

//NumberToWords.numberToWords(100);
//        NumberToWords.getDigitCount(0);
//        NumberToWords.getDigitCount(10);
//        NumberToWords.getDigitCount(100);
//        NumberToWords.getDigitCount(-100);


        NumberToWords.reverse(001);
        NumberToWords.getDigitCount(100);


    }



    private static int sumDigits(int number)
    {
        int sum = 0;

        if(number >= 10)
        {
            while(number > 0)
            {
                sum += number % 10;
                number = number / 10;
            }
            System.out.println("Sum of digits = " + sum);
            return sum;
        }
        else
        {
            System.out.println("Error");
            return -1;
        }
    }
}
