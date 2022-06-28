package ai.project.app.user_interfaces.checkout;

import net.serenitybdd.screenplay.targets.Target;

public class ThankYouPageUI {

    public static Target THANK_YOU_TITLE = Target.the("Thank you title")
            .locatedBy("//h2[@class='complete-header'][text()='THANK YOU FOR YOUR ORDER']");

    public static Target THANK_YOU_DESCRIPTION = Target.the("Thank you description")
            .locatedBy("//div[@class='complete-text'][text()='Your order has been dispatched, and will arrive just as fast as the pony can get there!']");

    public static Target BACK_HOME_BUTTON = Target.the("Back Home button")
            .locatedBy("//button[@class='btn btn_primary btn_small'][@name='back-to-products']");
}
