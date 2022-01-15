import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    public void testNumberOne(){
        Assert.assertEquals(1,FizzBuzz.getResult(1));
    }

    @Test
    public void testNumberTwo(){
        Assert.assertEquals(2,FizzBuzz.getResult(2));
    }



}
