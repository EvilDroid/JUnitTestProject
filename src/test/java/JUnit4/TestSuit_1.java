package JUnit4;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;


//How to make suits
@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                SomeFunctionalityTests_1.class,
                SomeFunctionalityTests_2.class
        }
)
public class TestSuit_1 {
}
