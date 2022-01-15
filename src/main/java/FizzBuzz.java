public class FizzBuzz {
    public static String getResult(int number) {
        if (number == 3)
            return "Fizz";
        else if (number == 5)
            return "Buzz";

        return String.valueOf(number);
    }
}