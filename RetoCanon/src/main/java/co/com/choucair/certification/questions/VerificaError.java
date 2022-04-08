package co.com.choucair.certification.questions;

import co.com.choucair.certification.model.CanonDatos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

import static co.com.choucair.certification.userinterface.SimuladorPage.alert_box;

public class VerificaError implements Question<Boolean> {

    private  final List<CanonDatos> canonDatosList;

    public VerificaError(List<CanonDatos> canonDatosList) {
        this.canonDatosList = canonDatosList;
    }

    public static VerificaError toThe(List<CanonDatos> canonDatosList) {
        return new VerificaError(canonDatosList);
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean result;
        String accion = Text.of(alert_box).viewedBy(actor).asString();
        result = accion.contains(canonDatosList.get(0).getError());
        return result;
    }
}
