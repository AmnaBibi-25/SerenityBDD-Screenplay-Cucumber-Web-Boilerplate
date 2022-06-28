package ai.project.app.modules.login.tasks;

import ai.project.app.modules.login.models.LoginParameters;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static ai.project.app.user_interfaces.checkout.ProductsPageUI.APP_LOGO;
import static ai.project.app.user_interfaces.login.LoginPageUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Login {

    public static Task using(LoginParameters loginParameters) {
        return Task.where("{0} login the app",
                Enter.keyValues(loginParameters.username).into(USERNAME_FIELD),
                Enter.keyValues(loginParameters.password).into(PASSWORD_FIELD),
                Click.on(LOGIN_BUTTON),
                WaitUntil.the(APP_LOGO, isVisible()).forNoMoreThan(15).seconds()
        );
    }
}
