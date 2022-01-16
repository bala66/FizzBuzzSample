import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    public static final String BUZZ = "Buzz";
    public static final String FIZZ = "Fizz";

    @Test
    public void testNumberOne() {
        assertEquals("1", FizzBuzz.getResult(1));
    }

    @Test
    public void testNumberTwo() {
        assertEquals("2", FizzBuzz.getResult(2));
    }

    @Test
    public void testNumberThree() {
        assertEquals(FIZZ, FizzBuzz.getResult(3));
    }

    @Test
    public void testNumberFive() {
        assertEquals(BUZZ, FizzBuzz.getResult(5));
    }

    @Test
    public void testNumberSix() {
        assertEquals(FIZZ, FizzBuzz.getResult(6));
    }

    @Test
    public void testNumberTen() {
        assertEquals(BUZZ, FizzBuzz.getResult(10));
    }

}
