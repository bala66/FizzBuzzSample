import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void testNumberOne(){
        assertEquals("1",FizzBuzz.getResult(1));
    }

    @Test
    public void testNumberTwo(){
        assertEquals("2",FizzBuzz.getResult(2));
    }

    @Test
    public void testNumberThree(){
        assertEquals("Fizz",FizzBuzz.getResult(3));
    }

    @Test
    public void testNumberFive() {
        assertEquals("Buzz", FizzBuzz.getResult(5));
    }
}
