package co.com.choucair.certification.stepdefinitions;

import co.com.choucair.certification.model.CanonDatos;
import co.com.choucair.certification.questions.Verifica;
import co.com.choucair.certification.tasks.Llenar;
import co.com.choucair.certification.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class SimulacionCanonStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage((new OnlineCast()));
    }

    @Given("^Laura ingresa a la pagina de bancolombia en la seccion simulacion de canon financiero$")
    public void lauraIngresaALaPaginaDeBancolombiaEnLaSeccionSimulacionDeCanonFinanciero(){
        OnStage.theActorCalled("Laura").wasAbleTo(OpenUp.thepage());
    }

    @When("^ingresa los datos necesarios para simular su canon$")
    public void ingresaLosDatosNecesariosParaSimularSuCanon(List <CanonDatos> canonDatosList){
        OnStage.theActorInTheSpotlight().attemptsTo(Llenar.formulario(canonDatosList));
    }

    @Then("^verifica los resultados obtenidos para su simulacion$")
    public void verificaLosResultadosObtenidosParaSuSimulacion(List <CanonDatos> canonDatosList) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Verifica.toThe(canonDatosList)));
    }
}
