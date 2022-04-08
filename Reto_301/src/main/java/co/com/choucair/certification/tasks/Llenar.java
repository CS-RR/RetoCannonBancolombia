package co.com.choucair.certification.tasks;

import co.com.choucair.certification.model.CanonDatos;
import co.com.choucair.certification.userinterface.SimulacionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class Llenar implements Task {

    private final List <CanonDatos> canonDatos;

    public Llenar(List<CanonDatos> canonDatos) {
        this.canonDatos = canonDatos;
    }

    public static Llenar formulario(List<CanonDatos> canonDatosList) {
        return Tasks.instrumented(Llenar.class,canonDatosList);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(String.valueOf(canonDatos.get(0).getValor())).into(SimulacionPage.valor_box),
                Enter.theValue(String.valueOf(canonDatos.get(0).getPlazo())).into(SimulacionPage.plazo_box),
                Enter.theValue(String.valueOf(canonDatos.get(0).getPorcentaje())).into(SimulacionPage.porcentaje_box),
                Click.on(SimulacionPage.tasa_box),
                Click.on(SimulacionPage.simular_button)
        );
    }
}
