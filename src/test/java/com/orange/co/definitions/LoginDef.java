package com.orange.co.definitions;

import com.orange.co.steps.login.LoginSteps;
import com.orange.co.steps.validations.ValidationStep;
import com.orange.co.utilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class LoginDef {

    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    LoginSteps login;

    @Steps(shared = true)
    ValidationStep validate;

    @Given("el usuario navega al sitio web")
    public void userNavigateTo(){
        url.navigateTo("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @When("inicio de sesion")
    public void userLogin(){
        login.typeUsername("Admin");
        login.typePassword("admin123");
        login.clickLogin();
    }

    @Then("se redirige a la pag principal")
    public void systemShowDashboard(){
        Assert.assertTrue(validate.tittleIsVisible());
    }



}

