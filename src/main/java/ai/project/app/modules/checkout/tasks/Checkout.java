package ai.project.app.modules.checkout.tasks;

import ai.project.app.modules.checkout.models.CheckoutParameters;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;

import static ai.project.app.user_interfaces.checkout.InformationPageUI.*;
import static ai.project.app.user_interfaces.checkout.ProductsPageUI.APP_LOGO;
import static ai.project.app.user_interfaces.checkout.ThankYouPageUI.*;

public class Checkout {

    public static Task fillYourInformation(CheckoutParameters checkoutParameters) {
        return Task.where("{0} fills Your Information form",
                Enter.keyValues(checkoutParameters.firstname).into(FIRSTNAME_FIELD),
                Enter.keyValues(checkoutParameters.lastname).into(LASTNAME_FIELD),
                Enter.keyValues(checkoutParameters.zipcode).into(ZIPCODE_FIELD),
                Click.on(CONTINUE_BUTTON)
        );
    }

    public static Task verifyCheckoutCompleteScreen() {
        return Task.where("{0} verifies Checkout: Complete screen",
                Ensure.that(THANK_YOU_TITLE).isDisplayed(),
                Ensure.that(THANK_YOU_DESCRIPTION).isDisplayed(),
                Click.on(BACK_HOME_BUTTON),
                Ensure.that(APP_LOGO).isDisplayed()
        );
    }


}
