public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public static String getResult(int number) {
        String result = "";
        if (number % 3 == 0)
            result+= FIZZ;

         if (number % 5 == 0)
            result+= BUZZ;

        return result.isEmpty() ? "" + String.valueOf(number) : result;
    }
}