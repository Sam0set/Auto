package co.com.orange.stepdefinitions;

import co.com.orange.tasks.LoginWithCredentials;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class LoginStep {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("coloca usuario y contraseña")
    public void enterKeys() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                LoginWithCredentials.withCredentials("dcarreno@fagorelectronica.com.co", "MPxjsgo5")
        );
    }

    @Then("se logea exitosamente")
    public void clickButton() {
        // Puedes agregar aquí un step para verificar si el login fue exitoso
        // Por ejemplo, si el usuario es redirigido a la página principal, puedes comprobar el título de la página
    }
}
