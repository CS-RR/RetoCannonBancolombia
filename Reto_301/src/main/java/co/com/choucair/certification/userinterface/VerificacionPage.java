package co.com.choucair.certification.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class VerificacionPage extends PageObject {


    public static final Target modalidad_box = Target.the("Verificamos la modalidad")
            .located(By.xpath("//*[@id='sim-detail']//*[contains(@value,'Vencida')]"));

    public static final Target valor_min = Target.the("Texto que nos indica un error en el campo")
            .located(By.xpath("//*[@id='sim-detail']//span[3][contains(text(),'El campo no cumple con el valor mínimo $ 10,000,000')]"));
    public static final Target valor_max = Target.the("Texto que nos indica un error en el campo")
            .located(By.xpath("//*[@id='sim-detail']//span[4][contains(text(),'El campo no cumple con el valor máximo 120')]"));
}
