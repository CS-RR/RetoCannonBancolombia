package co.com.choucair.certification.questions;

import co.com.choucair.certification.model.CanonDatos;
import co.com.choucair.certification.userinterface.ResultadosPage;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

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
        Boolean result;
        String credito = Text.of(ResultadosPage.credito_button).viewedBy(actor).asString();

        int numfilas = Serenity.getWebdriverManager().getCurrentDriver().findElements(
                By.xpath("//*[@id='cdk-accordion-child-0']/div/div")).size();
        int numcolum = Serenity.getWebdriverManager().getCurrentDriver().findElements(
                By.xpath("//*[@id='cdk-accordion-child-0']/div/div/small")).size() / numfilas;
        for (int i = 1; i<= numfilas; i++)
        {
            for (int j = 1; j<= numcolum; j++)
            {
                System.out.println(Serenity.getWebdriverManager().getCurrentDriver().findElement
                        (By.xpath("//*[@id='cdk-accordion-child-0']/div/div["+i+"]/small["+j+"]")).getText());
            }
        }
        result = credito.equals(canonDatosList.get(0).getCredito());
        System.out.println(credito);
       return  result;
    }
}
