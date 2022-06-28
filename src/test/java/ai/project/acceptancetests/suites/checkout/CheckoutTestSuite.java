package ai.project.acceptancetests.suites.checkout;

import ai.project.acceptancetests.common.LoginTestRunner;
import ai.project.acceptancetests.suites.checkout.support.CheckoutTestRunner;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        LoginTestRunner.class,
        CheckoutTestRunner.class
})

    public class CheckoutTestSuite {
}
