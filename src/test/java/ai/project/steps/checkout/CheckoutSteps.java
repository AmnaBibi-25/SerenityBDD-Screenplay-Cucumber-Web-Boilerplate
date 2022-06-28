package ai.project.steps.checkout;

import ai.project.app.modules.checkout.models.CheckoutParameters;
import com.google.gson.JsonObject;
import indexed.pojo.model.IndexedPojoDeserializer;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static ai.project.app.modules.checkout.interactions.Checkout.*;
import static ai.project.app.modules.checkout.tasks.Checkout.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CheckoutSteps {

    CheckoutParameters checkoutParameters;

    @Given("user is on products listing page")
    public void openListingsPage() {

    }

    @When("user selects the products using {jsonTestData} and move them to cart")
    public void selectProductAndMoveToCart(JsonObject parameters) {
        checkoutParameters = IndexedPojoDeserializer.deserializeJsonTo(parameters, CheckoutParameters.class);
        theActorInTheSpotlight().attemptsTo(
                selectProducts(checkoutParameters)
        );
    }

    @And("user verifies the cart")
    public void verifyCart() {
        theActorInTheSpotlight().attemptsTo(
                verifyProductsInfoOnCart(checkoutParameters)
        );
    }

    @And("user fills personal information and user verifies the overview page")
    public void enterInformation() {
        theActorInTheSpotlight().attemptsTo(
                fillYourInformation(checkoutParameters),
                verifyOverviewPage(checkoutParameters)
        );
    }

    @Then("user should be able to see Thank you message")
    public void verifySuccessfulCheckout() {
        theActorInTheSpotlight().attemptsTo(
                verifyCheckoutCompleteScreen()
        );
    }


}
