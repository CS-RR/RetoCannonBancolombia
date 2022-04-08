package co.com.choucair.certification.stepdefinitions;

import co.com.choucair.certification.model.CanonDatos;
import co.com.choucair.certification.questions.Verifica;
import co.com.choucair.certification.tasks.Despliega;
import co.com.choucair.certification.tasks.Ingresa;
import co.com.choucair.certification.tasks.OpenUp;
import co.com.choucair.certification.tasks.SearchPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class SimularCanonStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage((new OnlineCast()));
    }

    @Given("^Laura ingresa a la pagina de bancolombia en la seccion simulacion de canon financiero$")
    public void laura_ingresa_a_la_pagina_de_bancolombia_en_la_seccion_simulacion_de_canon_financiero(){
    OnStage.theActorCalled("Laura").wasAbleTo(OpenUp.thePage(),(SearchPage.PageLeasing()));
    }

    @When("^ingresa los datos necesarios para simular su canon$")
    public void ingresa_los_datos_necesarios_para_simular_su_canon(List<CanonDatos> canonDatosList)  {
        OnStage.theActorInTheSpotlight().attemptsTo(Ingresa.datos(canonDatosList));
    }
    @When("^revisa las tasas y tarifas incluidas$")
    public void revisaLasTasasYTarifasIncluidas() {
        OnStage.theActorInTheSpotlight().attemptsTo(Despliega.tabla());
    }

    @Then("^verifica los resultados obtenidos para su simulacion$")
    public void verifica_los_resultados_obtenidos_para_su_simulacion(List<CanonDatos> canonDatosList){
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Verifica.toThe(canonDatosList)));
    }

}
