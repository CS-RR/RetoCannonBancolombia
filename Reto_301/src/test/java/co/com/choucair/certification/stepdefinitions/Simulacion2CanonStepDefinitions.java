package co.com.choucair.certification.stepdefinitions;

import co.com.choucair.certification.model.CanonDatos;
import co.com.choucair.certification.questions.Verifica;
import co.com.choucair.certification.questions.VerificaError;
import co.com.choucair.certification.tasks.Llenar;
import co.com.choucair.certification.tasks.LlenarErroneo;
import co.com.choucair.certification.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class Simulacion2CanonStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage((new OnlineCast()));
    }

    @Given("^Laura ingresa  seccion simulacion de canon financiero$")
    public void laura_ingresa_seccion_simulacion_de_canon_financiero() {
        OnStage.theActorCalled("Laura").wasAbleTo(OpenUp.thepage());
    }

    @When("^ingresa datos erroneos para simular su canon$")
    public void ingresa_datos_erroneos_para_simular_su_canon(List<CanonDatos> canonDatosList) {
        OnStage.theActorInTheSpotlight().attemptsTo(LlenarErroneo.formulario(canonDatosList));
    }

    @Then("^verifica si permite realizar su simulacion$")
    public void verifica_si_permite_realizar_su_simulacion(List<CanonDatos> canonDatosList){
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificaError.toThe(canonDatosList)));
    }
}
