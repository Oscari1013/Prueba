package co.com.choucair.certification.prueba.stepdefinitions;

import co.com.choucair.certification.prueba.model.Udatos;
import co.com.choucair.certification.prueba.questions.R;
import co.com.choucair.certification.prueba.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UtestStepDefinition {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());

    }
    @Given("^Se desea registrar a un usuario en la pagina$")
    public void seDeseaRegistrarAUnUsuarioEnLaPagina() {
        OnStage.theActorCalled("Oscar").wasAbleTo(Abrir.laPagina());
    }

    @When("^Se diligenciara un formulario con los datos del usuario requerdios por el sistema$")
    public void seDiligenciaraUnFormularioConLosDatosDelUsuarioRequerdiosPorElSistema(List<Udatos> datos) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Llenar.lapagina(datos), LlenarUbicacion.lapagina(datos),
                LlenarDis.laPagina(datos), Llenarf.laPagina(datos)
        );
    }

    @Then("^porteriormente se debe clickear el boton de regitro para finalizar el mismo$")
    public void porteriormenteSeDebeClickearElBotonDeRegitroParaFinalizarElMismo(List<Udatos> datos) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(R.aLos(datos)));

    }
}
