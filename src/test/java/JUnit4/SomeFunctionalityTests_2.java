package JUnit4;

import org.junit.Assert;
import org.junit.Test;

public class SomeFunctionalityTests_2 {

    @Test
    public void someFunctionTest_useFunction1_functionWorks(){
        System.out.println("test1");
        Assert.assertTrue("Not equal", 1 == 1);
    }

    @Test
    public void someFunctionTest_useFunction2_functionWorks(){
        System.out.println("test2");
        Assert.assertTrue("Not equal", 1 == 1);
    }
}
