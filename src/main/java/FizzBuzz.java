public class FizzBuzz {

    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 100;
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

    public static void buildOutput() {
        for (int index = MIN_VALUE; index <= MAX_VALUE; index++) {
            System.out.println(getResult(index));
        }
    }
}