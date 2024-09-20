package co.com.orange.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
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
    public void EnterKeys() {

    }

    @Then("se logea exitosamente")
    public void ClickButton() {

    }


}
