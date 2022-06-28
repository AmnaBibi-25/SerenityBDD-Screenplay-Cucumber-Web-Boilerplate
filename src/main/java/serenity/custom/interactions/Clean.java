package serenity.custom.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.Keys;

public class Clean implements Interaction {
    private Target target;

    public Clean(Target target) {
        this.target = target;
    }

    public static Clean field(Target target) {
        return new Clean(target);
    }

    @Override
    public <T extends Actor> void performAs(T t) {
        for (int i=0; i<2; i++) {
            t.attemptsTo(
                    Enter.keyValues(Keys.BACK_SPACE).into(target)
            );
        }
    }
}

