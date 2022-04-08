package co.com.choucair.certification.tasks;


import co.com.choucair.certification.userinterface.LeasingPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SearchPage implements Task {

    public static SearchPage PageLeasing() {
        return Tasks.instrumented(SearchPage.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LeasingPage.pagina_principal),
                Click.on(LeasingPage.productos_servicios),
                Click.on(LeasingPage.producto_leasing),
                Click.on(LeasingPage.leasing_habitacional),
                Click.on(LeasingPage.simula_button),
                Click.on(LeasingPage.valor_vivienda)
        );
    }
}
