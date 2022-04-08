package co.com.choucair.certification.tasks;


import co.com.choucair.certification.userinterface.CanonPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {

    private CanonPage canonPage;
    public static OpenUp thepage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(canonPage)
        );

    }
}
