import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FibonacciTest {

    private Fibonacci fibonacci;

    @BeforeEach
    public void setup(){
        fibonacci = new Fibonacci();
    }

    @AfterEach
    public void finish(){
        fibonacci = null;
    }

    @Test
    public void computeNegativeValueThrowsException(){
        assertThrows(RuntimeException.class, () -> fibonacci.compute(-1));
    }

    @Test
    public void computeValue0Returns0(){

        int expectedValue = 0;
        int resultValue = fibonacci.compute(0);

        assertEquals(expectedValue, resultValue);
    }

    @Test
    public void computeValue1Returns1(){

        int expectedValue = 1;
        int resultValue = fibonacci.compute(1);

        assertEquals(expectedValue, resultValue);
    }

    @Test
    public void computeValue2Returns1(){

        int expectedValue = 1;
        int resultValue = fibonacci.compute(2);

        assertEquals(expectedValue, resultValue);
    }
}
