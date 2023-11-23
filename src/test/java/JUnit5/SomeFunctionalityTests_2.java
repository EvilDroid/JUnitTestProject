package JUnit5;
//https://www.youtube.com/watch?v=nAF7tOI_P44&list=PLmrN-SZCREltdVAYu9C8vt8BnTJU9nWRj&index=4


import org.junit.jupiter.api.*;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Tag("tag1")
public class SomeFunctionalityTests_2 {

    @Test
    public void someFunctionTest_useFunction1_functionWorks() {
        System.out.println("test1");
        Assertions.assertTrue(1 == 1, "Not equal");
    }

    @Test
    public void someFunctionTest_useFunction2_functionWorks(){
        System.out.println("test2");
        Assertions.assertTrue(1 == 1, "Not equal");
    }

}
