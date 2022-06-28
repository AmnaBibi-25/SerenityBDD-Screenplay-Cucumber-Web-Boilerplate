package ai.project.hooks;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static ai.project.parameters.Parameters.actor;


public class AuthenticationHooks {
    public static Actor actor;


    @Before(order = 2)
    public void set_the_stage() {
        setTheStage(new OnlineCast());
        actor = actor("user");
    }
}
