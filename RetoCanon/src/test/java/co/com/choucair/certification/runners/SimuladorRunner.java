package co.com.choucair.certification.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/Simulacion_Canon.feature",
        tags = "@scenario2",
        glue = "co.com.choucair.certification.stepdefinitions",
        snippets = SnippetType.CAMELCASE )

public class SimuladorRunner {

}
