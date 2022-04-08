package co.com.choucair.certification.questions;

import co.com.choucair.certification.model.CanonDatos;
import co.com.choucair.certification.userinterface.VerificacionPage;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Value;
import org.openqa.selenium.By;

import java.util.List;

public class Verifica implements Question<Boolean> {

    private  final List<CanonDatos> canonDatosList;

    public Verifica(List<CanonDatos> canonDatosList) {
        this.canonDatosList= canonDatosList;
    }

    public static Verifica toThe(List<CanonDatos> canonDatosList) {
        return new Verifica(canonDatosList);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
       boolean result;
        String tipomodalidad = Value.of(VerificacionPage.modalidad_box).viewedBy(actor).asString();
        int numfilas = Serenity.getWebdriverManager().getCurrentDriver().findElements(
                By.xpath("//*[@id='resultado']/div/table/tbody/tr")).size();
        int numcolum = Serenity.getWebdriverManager().getCurrentDriver().findElements(
                By.xpath("//*[@id='resultado']/div/table/tbody/tr/td")).size() / numfilas;
        for (int i = 1; i<= numfilas; i++)
        {
            for (int j = 1; j<= numcolum; j++)
            {
                System.out.println(Serenity.getWebdriverManager().getCurrentDriver().findElement
                        (By.xpath("//*[@id='resultado']/div/table/tbody/tr["+i+"]/td["+j+"]")).getText());
            }
        }

        result= tipomodalidad.equals(canonDatosList.get(0).getModalidad());
        System.out.println("Modalidad: " + tipomodalidad);
        return result;
    }

}
