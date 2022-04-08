package co.com.choucair.certification.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ResultadosPage extends PageObject {


    public static final Target button_expand = Target.the("Damos clic para expandir Tasas y tarifas incluidas")
            .located((By.xpath("(//span[@style='transform: rotate(0deg);'])[1]")));
    public static final Target credito_button = Target.the("Boton para seleccion credito vivienda")
            .located(By.xpath("//*[@id='credit-on-pesos-button']//*[contains(text(),'Crédito de Vivienda')]"));
}
