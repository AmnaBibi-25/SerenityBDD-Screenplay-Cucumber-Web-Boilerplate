package ai.project.app.user_interfaces.checkout;

import net.serenitybdd.screenplay.targets.Target;

public class OverviewPageUI {

    public static Target PAYMENT_INFORMATION = Target.the("Payment Information")
            .locatedBy("//div[@class='summary_value_label'][text()][1]");

    public static Target SHIPPING_INFORMATION = Target.the("Shipping information")
            .locatedBy("//div[@class='summary_value_label'][text()][2]");

    public static Target TOTAL_BILL = Target.the("Total bill")
            .locatedBy("//div[@class='summary_total_label'][text()]");

    public static Target FINISH_BUTTON = Target.the("Finish button")
            .locatedBy("//button[@class='btn btn_action btn_medium cart_button'][@name='finish']");
}
