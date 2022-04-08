package co.com.choucair.certification.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SimulacionPage extends PageObject {

    public static final Target valor_box = Target.the("Ingresamos el valor del activo")
            .located(By.xpath("//*[@id='sim-detail']//*[@name='valorActivo']"));
    public static final Target plazo_box = Target.the("Ingresamos el valor en meses")
            .located(By.xpath("//*[@id='sim-detail']//*[@name='plazo']"));
    public static final Target porcentaje_box = Target.the("Ingresamo el porcentaje de compra")
            .located(By.xpath("//*[@id='sim-detail']//*[@name='opcionCompra']"));
    public static final Target tasa_box = Target.the("Escogemos el tipo de tasa")
            .located(By.xpath("//*[@id='sim-detail']//option[@value='0']"));
    public static final Target simular_button = Target.the("Damos clic en el boton simular")
            .located(By.xpath("//*[@id='sim-detail']//button[@name='simular']"));
}
