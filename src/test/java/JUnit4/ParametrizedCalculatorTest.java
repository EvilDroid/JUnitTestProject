package JUnit4;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;

@RunWith(Parameterized.class)
public class ParametrizedCalculatorTest {

    //parameters
    private final int valueA;
    private final int valueB;
    private final int expectedResult;

    //constructor
    public ParametrizedCalculatorTest(int valueA, int valueB, int expectedResult) {
        this.valueA = valueA;
        this.valueB = valueB;
        this.expectedResult = expectedResult;
    }

    //not param for example
    @Test
    public  void  calculatorNotParametrizedTest_summ_correctSumm(){
        Calculator calc = new Calculator();
        Assert.assertSame(2, calc.summ(1, 1));
    }

    @Parameterized.Parameters
    public static Iterable <Object []> testData (){
        return Arrays.asList(new Object[][]{
                {1, 1, 2},
                {2, 2, 4},
                {3, 3, 6},
                {4, 4, 9},
        });
    }

    //parametrized
    @Test
    public  void  calculatorTest_summ_correctSumm(){
        Calculator calc = new Calculator();
        Assert.assertSame(expectedResult, calc.summ(valueA, valueB));
    }
}
