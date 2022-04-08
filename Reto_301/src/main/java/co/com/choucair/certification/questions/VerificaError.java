package co.com.choucair.certification.questions;

import co.com.choucair.certification.model.CanonDatos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

import static co.com.choucair.certification.userinterface.VerificacionPage.valor_max;
import static co.com.choucair.certification.userinterface.VerificacionPage.valor_min;

public class VerificaError implements Question<Boolean>{

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

        String text1 = Text.of(valor_min).viewedBy(actor).asString();
        String text2 =Text.of(valor_max).viewedBy(actor).asString();

        boolean text_error = text1.equals(canonDatosList.get(0).getValormin());
        boolean text_error2 = text2.equals(canonDatosList.get(0).getValormax());
        result = text_error && text_error2;
        System.out.println("Presenta los siguiente errores: \n"+ text1 +"\n"+ text2);
        return result;
    }
}
