package ai.project.acceptancetests.suites;

import ai.project.acceptancetests.common.DefaultTestRunner;
import ai.project.acceptancetests.common.LoginTestRunner;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        LoginTestRunner.class,
        DefaultTestRunner.class
})

public class DevelopmentTestSuite {
}
