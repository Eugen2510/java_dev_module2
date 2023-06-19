package calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class SumCalculatorTest {
    SumCalculator calculator;

    @BeforeEach
    public  void method(){
        calculator = new SumCalculator();
    }

    @Test
    public void testThatSumMethodWorksOkFor1(){
        int n = 1;
        int actual = calculator.sum(n);
        int expected = 1;
        Assertions.assertEquals(expected, actual, String.valueOf(n));
    }

    @Test
    public void testThatSumMethodWorksOkFor3(){
        int n = 3;
        int actual = calculator.sum(n);
        int expected = 6;
        Assertions.assertEquals(expected, actual, String.valueOf(n));
    }

    @Test
    public void testThatExceptionThrownFor0(){
        int n = 0;
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.sum(n));
    }
}