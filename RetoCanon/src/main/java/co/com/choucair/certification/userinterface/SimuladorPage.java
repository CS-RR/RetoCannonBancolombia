package co.com.choucair.certification.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SimuladorPage extends PageObject {

    public static final Target valor_box = Target.the("Ingresamos el valor de la vivienda")
            .located(By.id("valor-simulacion"));
    public static final Target porcentaje_box = Target.the("Ingresamos el valor que necesitamos")
            .located(By.xpath("//*[@id='elegir-porcentaje']/div/div[2]"));
    public static final Target elegir_porcentaje= Target.the("Escogemos el valor del porcentaje")
            .located(By.xpath("//*[@id='mat-option-4']/span"));
    public static final Target plazo_box = Target.the("Ingresamos el tiempo en años")
            .located(By.id("valor-year"));
    public static final Target fecha_box = Target.the("Escogemos una fecha de nacimiento")
            .located(By.id("campo-fecha"));
    public static final Target año_box = Target.the("Escogemos el año")
            .located(By.xpath("//*[@id='mat-datepicker-0']//div[contains(text(),'1994')]"));
    public static final Target mes_box = Target.the("Escogemos el mes")
            .located(By.xpath("//*[@id='mat-datepicker-0']//*[contains(text(),' OCT ')]"));
    public static final Target dia_box = Target.the("Escogemos el dia")
            .located(By.xpath("//*[@id='mat-datepicker-0']//*[contains(text(),' 2 ')]"));
    public static final Target button_simular = Target.the("Clic en el boton simular")
            .located(By.id("boton-simular"));
    public static final Target alert_box = Target.the("Muestra mensaje de error en los campos")
            .located(By.xpath("//*[@role='alert'][contains(text(),'El campo no cumple')]"));
}
