public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZ_BUZZ = "FizzBuzz";

    public static String getResult(int number) {
        if(isFizzBuzz(number))
            return FIZZ_BUZZ;
        if (isFizz(number))
            return FIZZ;
        else if (isBuzz(number))
            return BUZZ;

        return String.valueOf(number);
    }

    private static boolean isFizzBuzz(int number) {
        return isFizz(number) && isBuzz(number);
    }

    private static boolean isBuzz(int number) {
        return number % 5 == 0;
    }

    private static boolean isFizz(int number) {
        return number % 3 == 0;
    }


}