package co.com.choucair.certification.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.certification.userinterface.ResultadosPage.button_expand;

public class Despliega implements Task {

    public static Despliega tabla() {
        return Tasks.instrumented(Despliega.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
              actor.attemptsTo(
                      Click.on((button_expand))
              );
    }
}
