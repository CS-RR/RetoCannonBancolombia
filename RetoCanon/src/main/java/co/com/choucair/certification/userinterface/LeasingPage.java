package co.com.choucair.certification.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LeasingPage extends PageObject {

    public static final Target pagina_principal = Target.the("Escogemos ir a la pagina princial")
            .located(By.xpath("//*[@id='modal-prehome-fenix']//button[contains(text(),'IR A LA PÁGINA PRINCIPAL')]"));
    public static final Target productos_servicios = Target.the("Seccion de productos y servicios")
            .located(By.id("menu-productos"));
    public static final Target producto_leasing = Target.the("Escogemos producto leasing")
            .located(By.id("header-productos-leasing"));
    public static final Target leasing_habitacional = Target.the("Escogemos seccion leasing habitacion")
            .located(By.xpath("//*[@id='category-detail']//a[contains(text(),'Leasing Habitacional')]"));
    public static final Target simula_button = Target.the("Boton para ir al simulador")
            .located(By.xpath("//*[@id='menu-sticky']//*[contains(text(),'Simula')]"));
    public static final Target valor_vivienda = Target.the("Seccion simular segun valor vivienda")
            .located(By.id("calcular-cuotas"));

}
