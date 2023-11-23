package JUnit5;
//https://www.youtube.com/watch?v=nAF7tOI_P44&list=PLmrN-SZCREltdVAYu9C8vt8BnTJU9nWRj&index=4


import org.junit.jupiter.api.*;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@DisplayName("Name for tests class")
public class SomeFunctionalityTests_1 {

    @BeforeAll
    public static void beforeClass(){
        System.out.println("Some actions before whole class");
    }

    @AfterAll
    public static void afterClass(){
        System.out.println("Some actions after whole class");
    }

    @BeforeEach
    public  void beforeEach(){
        System.out.println("Some actions before each test");
    }

    @AfterEach
    public void  afterEach(){
        System.out.println("Some actions after each test");
    }


    @Test
    @DisplayName("Name for Test 1")
    public void someFunctionTest_useFunction1_functionWorks() {
        System.out.println("test1");
        Assertions.assertTrue(1 == 1, "Not equal");
        Assertions.assertNotNull(this); //equals
        Assertions.assertEquals("string", "string", "Message");

        int a = 1;
        int b = 1;
        int c = 2;
        Assertions.assertSame(a, b); // ==
        Assertions.assertNotSame(a, c);

        int[] arr1 = new int[]{1, 2};
        int[] arr2 = new int[]{1, 2};
        Assertions.assertArrayEquals(arr1, arr2);//arrays

        List<Integer> listOfInt1 = new ArrayList<Integer>(Arrays.asList(1, 2));
        List<Integer> listOfInt2 = new ArrayList<Integer>(Arrays.asList(1, 2));
        Assertions.assertIterableEquals(listOfInt1, listOfInt2);//iterations

        List<String> listOfString1 = new ArrayList<String>(Arrays.asList("1", "2"));
        List<String> listOfString2 = new ArrayList<String>(Arrays.asList("1", "2"));
        Assertions.assertLinesMatch(listOfString1, listOfString2);//lists of string


        Assertions.assertTimeout(Duration.ofMillis(100), () -> {//long processes testing without interrupt, make timeout to stop perform test if it works too long
            Thread.sleep(99);
            return "result";
        });

        Assertions.assertTimeoutPreemptively(Duration.ofMillis(100), () -> {//long processes testing with interrupt, make timeout to stop perform test if it works too long
            Thread.sleep(99);
            return "result";
        });

        Assertions.assertThrows(Exception.class, () -> {//Exception expected
            throw new IllegalArgumentException("error message");
        });
    }

    @Test
    public void failAssertExample(){
        System.out.println("fail");
        Assertions.fail("this will fail");
    }

    @Test
    public void someFunctionTest_useFunction2_functionWorks(){
        System.out.println("test2");
        Assertions.assertTrue(1 == 1, "Not equal");
    }

    @Test
    @Disabled//Instead ignore annotation
    public void someFunctionTest_useFunction3_functionWorks(){
        System.out.println("test3");
        Assertions.assertTrue(1 == 1, "Not equal");
    }

    @Test
    @Disabled ("Comment why ignored")//ignore test with comment
    public void someFunctionTest_useFunction4_functionWorks(){
        System.out.println("test4");
        Assertions.assertTrue(1 == 1, "Not equal");
    }

}
