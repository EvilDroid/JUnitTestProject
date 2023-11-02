package JUnit4;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(DataProviderRunner.class)
public class ParametrizedCalculatorTestWithDataProvider {

    @DataProvider
    public static Object [][] testData (){
        return new Object[][]{
                {1, 1, 2},
                {2, 2, 4},
                {3, 3, 6},
                {4, 4, 9},
        };
    }

    //parametrized
    @UseDataProvider("testData")
    @Test
    public  void  calculatorTest_summ_correctSumm(int valueA, int valueB, int expectedResult){
        Calculator calc = new Calculator();
        Assert.assertSame(expectedResult, calc.summ(valueA, valueB));
    }
}
