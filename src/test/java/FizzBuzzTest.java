import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 100;
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

    @Test
    public void testNumberFifteen() {
        assertEquals(FIZZ+BUZZ, FizzBuzz.getResult(15));
    }

    @Test
    public void testNumberThirty() {
        assertEquals(FIZZ+BUZZ, FizzBuzz.getResult(30));
    }

    @Test
    public void testSequenceOneToHundred(){
        for(int index=MIN_VALUE ; index<=MAX_VALUE; index++){
            if(index % 3 == 0 && index % 5 == 0)
                assertEquals(FIZZ+BUZZ, FizzBuzz.getResult(index));
            else if(index % 3 == 0)
                assertEquals(FIZZ, FizzBuzz.getResult(index));
            else if(index % 5 == 0)
                assertEquals(BUZZ, FizzBuzz.getResult(index));

        }
    }
}
