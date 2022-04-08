package co.com.choucair.certification.tasks;

import co.com.choucair.certification.model.CanonDatos;
import co.com.choucair.certification.userinterface.SimuladorPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;

import java.util.List;

public class Ingresa implements Task {


    private final List <CanonDatos> canonDatos;

    public Ingresa(List<CanonDatos> canonDatos) {
        this.canonDatos = canonDatos;
    }

    public static Ingresa datos(List<CanonDatos> canonDatosList) {
        return Tasks.instrumented(Ingresa.class,canonDatosList);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(String.valueOf(canonDatos.get(0).getValor())).into(SimuladorPage.valor_box),
                Click.on(SimuladorPage.porcentaje_box),
                Click.on(SimuladorPage.elegir_porcentaje),
                Enter.theValue(String.valueOf(canonDatos.get(0).getPlazo())).into(SimuladorPage.plazo_box),
                Click.on(SimuladorPage.fecha_box),
                Click.on(SimuladorPage.año_box),
                Click.on(SimuladorPage.mes_box),
                Click.on(SimuladorPage.dia_box),
                Click.on(SimuladorPage.button_simular)
        );
    }
}
