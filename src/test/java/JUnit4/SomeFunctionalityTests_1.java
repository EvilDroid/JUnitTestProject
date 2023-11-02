package JUnit4;
//https://www.youtube.com/watch?v=nAF7tOI_P44&list=PLmrN-SZCREltdVAYu9C8vt8BnTJU9nWRj&index=4

import org.junit.*;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING) //Starting tests by order, not random
public class SomeFunctionalityTests_1 {

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Some actions before whole class");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("Some actions after whole class");
    }

    @Before
    public  void beforeEach(){
        System.out.println("Some actions before each test");
    }

    @After
    public void  afterEach(){
        System.out.println("Some actions after each test");
    }

    @Test
    public void someFunctionTest_useFunction1_functionWorks(){
        System.out.println("test1");
        Assert.assertTrue("Not equal", 1 == 1);
        Assert.assertNotNull(this);
        Assert.assertEquals("Message", "string", "string");

    }

    @Test
    public void someFunctionTest_useFunction2_functionWorks(){
        System.out.println("test2");
        Assert.assertTrue("Not equal", 1 == 1);
    }

    @Test
    @Ignore//ignore test
    public void someFunctionTest_useFunction3_functionWorks(){
        System.out.println("test3");
        Assert.assertTrue("Not equal", 1 == 1);
    }

    @Test
    @Ignore ("Comment why ignored")//ignore test with comment
    public void someFunctionTest_useFunction4_functionWorks(){
        System.out.println("test4");
        Assert.assertTrue("Not equal", 1 == 1);
    }

    @Test (timeout = 1000)//make timeout to stop perform test if it works too long
    public void someFunctionTest_useFunction5_functionWorks() throws InterruptedException {
        System.out.println("test5");
        Thread.sleep(1001);
        Assert.assertTrue("Not equal", 1 == 1);
    }

    @Test (expected = Exception.class)//Expected that method throws exeption
    public void someFunctionTest_useFunctio6_functionWorks() throws Exception {
        System.out.println("test6");
        throw new Exception("Exception thrown");
        //Assert.assertTrue("Not equal", 1 == 1);
    }



}
