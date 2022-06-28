package ai.project.app.user_interfaces.checkout;

import net.serenitybdd.screenplay.targets.Target;

public class ProductsPageUI {

    public static Target APP_LOGO = Target.the("App logo")
            .locatedBy("//div[@class='app_logo']");

    public static Target PRODUCT = Target.the("Product")
            .locatedBy("//div[@class='inventory_item_name'][text()='{0}']");

    public static Target PRODUCT_DESCRIPTION = Target.the("Product description")
            .locatedBy("(//div[@class='inventory_item_name'][text()='{0}']//following::div[@class='inventory_item_desc'])[1]");

    public static Target PRODUCT_PRICE = Target.the("Product price")
            .locatedBy("(//div[@class='inventory_item_name'][text()='{0}']//following::div[@class='inventory_item_price'][text()])[1]");

    public static Target ADD_TO_CART_BUTTON = Target.the("Add to Cart button")
            .locatedBy("(//div[@class='inventory_item_name'][text()='{0}']//following::button[@class='btn btn_primary btn_small btn_inventory'][text()='Add to cart'])[1]");

    public static Target SHOPPING_CART_BADGE = Target.the("Shopping cart badge")
            .locatedBy("//a[@class='shopping_cart_link']//span[@class='shopping_cart_badge'][text()='{0}']");

    public static Target CHECKOUT_BUTTON = Target.the("Checkout button")
            .locatedBy("//button[@class='btn btn_action btn_medium checkout_button'][@name='checkout']");
}
