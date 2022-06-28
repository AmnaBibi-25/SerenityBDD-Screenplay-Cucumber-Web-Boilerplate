package ai.project.app.user_interfaces.checkout;

import net.serenitybdd.screenplay.targets.Target;

public class InformationPageUI {

    public static Target FIRSTNAME_FIELD = Target.the("Firstname field")
            .locatedBy("//input[contains(@class,'form_input')][@name='firstName']");

    public static Target LASTNAME_FIELD = Target.the("Lastname field")
            .locatedBy("//input[contains(@class,'form_input')][@name='lastName']");

    public static Target ZIPCODE_FIELD = Target.the("Zipcode field")
            .locatedBy("//input[contains(@class,'form_input')][@name='postalCode']");

    public static Target CONTINUE_BUTTON = Target.the("Continue button")
            .locatedBy("//input[@type='submit'][@name='continue']");
}
