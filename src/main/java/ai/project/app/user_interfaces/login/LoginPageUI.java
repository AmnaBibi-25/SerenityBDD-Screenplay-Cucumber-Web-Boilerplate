package ai.project.app.user_interfaces.login;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPageUI {

    public static Target USERNAME_FIELD = Target.the("Username field")
            .locatedBy("//input[contains(@class,'form_input')][@name='user-name']");

    public static Target PASSWORD_FIELD = Target.the("Password field")
            .locatedBy("//input[contains(@class,'form_input')][@name='password']");

    public static Target LOGIN_BUTTON = Target.the("Login button")
            .locatedBy("//input[@class='submit-button btn_action'][@name='login-button']");
}
