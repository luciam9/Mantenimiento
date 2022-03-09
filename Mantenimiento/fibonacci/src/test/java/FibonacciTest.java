import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FibonacciTest {

    private Fibonacci fibonacci;

    //método que se ejecuta antes de cada test, instancia el atributo fibonacci
    @BeforeEach
    public void setup(){
        fibonacci = new Fibonacci();
    }

    @AfterEach
    public void finish(){
        fibonacci = null;
    }

    //Test que comprueba que se lanza una excepción si se inserta un número < 0
    @Test
    public void computeNegativeValueThrowsException(){
        assertThrows(RuntimeException.class, () -> fibonacci.compute(-1));
    }

    //Test que comprueba el correcto funcionamiento de un número válido
    @Test
    public void computeValue0Returns0(){

        int expectedValue = 0;
        int resultValue = fibonacci.compute(0);

        assertEquals(expectedValue, resultValue);
    }

    //Test que comprueba el correcto funcionamiento de un número válido
    @Test
    public void computeValue1Returns1(){

        int expectedValue = 1;
        int resultValue = fibonacci.compute(1);

        assertEquals(expectedValue, resultValue);
    }

    //Test que comprueba el correcto funcionamiento de un número válido
    @Test
    public void computeValue4Returns3(){

        int expectedValue = 3;
        int resultValue = fibonacci.compute(4);

        assertEquals(expectedValue, resultValue);
    }
}
