package JUnit5;


import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SuiteDisplayName("Suite Name")
@SelectClasses({SomeFunctionalityTests_1.class, SomeFunctionalityTests_2.class})
public class TestSuitClasses_1 {
}
