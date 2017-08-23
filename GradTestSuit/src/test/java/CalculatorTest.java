import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void instantiateCalculator() {
        calculator = new Calculator();
    }

    @Test
    public void addingNumbers() {
        assertThat(calculator.addNumbers(5, 6), equalTo(11));
    }
    @Test
    public void doubleAdd() {
       assertThat(calculator.add(1.0, 2.0), is(equalTo(3.0)));
    }
    @Test
    public void testFactorial(){
        assertEquals((Object)24, calculator.factorial(4));
    }
    @Test
    public void testFactorial2(){
        assertNotEquals((Object)120,calculator.factorial(4));
    }
    @Test
    public void longAdd(){
        assertEquals((Object)12L, calculator.add(5,7));
    }
}
