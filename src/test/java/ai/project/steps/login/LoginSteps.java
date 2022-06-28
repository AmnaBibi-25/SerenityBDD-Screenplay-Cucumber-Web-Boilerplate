package ai.project.steps.login;

import ai.project.app.modules.login.models.LoginParameters;
import ai.project.app.modules.login.tasks.Login;
import com.google.gson.JsonObject;
import indexed.pojo.model.IndexedPojoDeserializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.ensure.Ensure;
import serenity.custom.tasks.Navigate;

import static ai.project.app.user_interfaces.checkout.ProductsPageUI.APP_LOGO;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginSteps {

    LoginParameters loginParameters;

    @Given("user is on Sauce Demo webapp page")
    public void navigateToSauceDemoWebpage() {
        theActorInTheSpotlight().attemptsTo(
                Navigate.to("webdriver.base.url")
        );
    }

    @When("user enters credentials using {jsonTestData}")
    public void fillLoginForm(JsonObject parameters) {

        loginParameters = IndexedPojoDeserializer.deserializeJsonTo(parameters, LoginParameters.class);

        theActorInTheSpotlight().attemptsTo(
                Login.using(loginParameters)

        );
    }
    @Then("user should be successfully logged into the app")
    public void verifySuccessfulLogin() {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(APP_LOGO).isDisplayed()
        );
    }
}
