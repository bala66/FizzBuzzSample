public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public static String getResult(int number) {
        if (number % 3 == 0)
            return FIZZ;
        else if (number % 5 == 0)
            return BUZZ;

        return String.valueOf(number);
    }
}