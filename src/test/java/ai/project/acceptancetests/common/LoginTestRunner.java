package ai.project.acceptancetests.common;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static ai.project.statics.Constants.PROJECT_GLUE;
import static ai.project.statics.FilePaths.LOGIN_FILE_PATH;
import static ai.project.statics.Tags.LOGIN;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = LOGIN_FILE_PATH, glue = PROJECT_GLUE, tags = LOGIN)

public class LoginTestRunner {
}
