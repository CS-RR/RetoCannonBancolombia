package co.com.choucair.certification.stepdefinitions;

import co.com.choucair.certification.model.CanonDatos;
import co.com.choucair.certification.questions.VerificaError;
import co.com.choucair.certification.tasks.IngresaErroneo;
import co.com.choucair.certification.tasks.OpenUp;
import co.com.choucair.certification.tasks.SearchPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

public class Simular2CanonStepDefinitions {

    @Given("^Laura ingresa  seccion simulacion de canon financiero$")
    public void lauraIngresaSeccionSimulacionDeCanonFinanciero(){
        OnStage.theActorCalled("Laura").wasAbleTo(OpenUp.thePage(),(SearchPage.PageLeasing()));
    }

    @When("^ingresa datos erroneos para simular su canon$")
    public void ingresaDatosErroneosParaSimularSuCanon(List<CanonDatos> canonDatosList){
        OnStage.theActorInTheSpotlight().attemptsTo(IngresaErroneo.datos(canonDatosList));
    }

    @Then("^verifica si permite realizar su simulacion$")
    public void verificaSiPermiteRealizarSuSimulacion(List<CanonDatos>canonDatosList){
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificaError.toThe((canonDatosList))));
    }
}
