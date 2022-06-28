package ai.project.app.modules.checkout.interactions;

import ai.project.app.modules.checkout.models.CheckoutParameters;
import net.serenitybdd.screenplay.AnonymousPerformableFunction;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;

import static ai.project.app.user_interfaces.checkout.OverviewPageUI.*;
import static ai.project.app.user_interfaces.checkout.ProductsPageUI.*;

public class Checkout {

    public static AnonymousPerformableFunction selectProducts(CheckoutParameters checkoutParameters) {
        return Task.where("{0} selects the products", actor -> {
            int size = checkoutParameters.products.size();

            for(int i = 0; i < size; i++) {
                actor.attemptsTo(
                        Click.on(ADD_TO_CART_BUTTON.of(checkoutParameters.products.get(i)))
                );
            }
            actor.attemptsTo(
                    Click.on(SHOPPING_CART_BADGE.of(String.valueOf(checkoutParameters.products.size())))
            );
        });
    }

    public static AnonymousPerformableFunction verifyProductsInfoOnCart(CheckoutParameters checkoutParameters) {
        return Task.where("{0} verifies products and their information on the cart page", actor -> {
            int size = checkoutParameters.products.size();

            for(int i = 0; i < size; i++) {
                actor.attemptsTo(
                        Ensure.that(PRODUCT.of(checkoutParameters.products.get(i))).isDisplayed(),
                        Ensure.that(PRODUCT_DESCRIPTION.of(checkoutParameters.products.get(i))).isDisplayed(),
                        Ensure.that(PRODUCT_PRICE.of(checkoutParameters.products.get(i))).isDisplayed()
                );
            }
            actor.attemptsTo(
                    Click.on(CHECKOUT_BUTTON)
            );
        });
    }

    public static AnonymousPerformableFunction verifyOverviewPage(CheckoutParameters checkoutParameters) {
        return Task.where("{0} verifies products and their information on the overview page", actor -> {

            for(int i = 0; i < checkoutParameters.products.size(); i++) {
                actor.attemptsTo(
                        Ensure.that(PRODUCT.of(checkoutParameters.products.get(i))).isDisplayed(),
                        Ensure.that(PRODUCT_DESCRIPTION.of(checkoutParameters.products.get(i))).isDisplayed(),
                        Ensure.that(PRODUCT_PRICE.of(checkoutParameters.products.get(i))).isDisplayed()
                );
            }
            actor.attemptsTo(
                    Ensure.that(PAYMENT_INFORMATION).isDisplayed(),
                    Ensure.that(SHIPPING_INFORMATION).isDisplayed(),
                    Ensure.that(TOTAL_BILL).isDisplayed(),
                    Click.on(FINISH_BUTTON)
            );
        });
    }
}
