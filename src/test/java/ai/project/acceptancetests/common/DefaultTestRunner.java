package ai.project.acceptancetests.common;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static ai.project.statics.Constants.PROJECT_GLUE;
import static ai.project.statics.FilePaths.ALL_FEATURES_DIRECTORY_PATH;
import static ai.project.statics.Tags.CURRENT;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = ALL_FEATURES_DIRECTORY_PATH, glue = PROJECT_GLUE, tags = CURRENT)

public class DefaultTestRunner {
}
