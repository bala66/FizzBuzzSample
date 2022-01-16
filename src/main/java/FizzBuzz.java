public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public static String getResult(int number) {
        if (isFizz(number))
            return FIZZ;
        else if (number == 5)
            return BUZZ;

        return String.valueOf(number);
    }

    private static boolean isFizz(int number) {
        return number % 3 == 0;
    }


}