package ai.project.acceptancetests.suites.checkout.support;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static ai.project.statics.Constants.PROJECT_GLUE;
import static ai.project.statics.FilePaths.CHECKOUT_FILE_PATH;
import static ai.project.statics.Tags.CHECKOUT;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = CHECKOUT_FILE_PATH, glue = PROJECT_GLUE, tags = CHECKOUT)

public class CheckoutTestRunner {
}
