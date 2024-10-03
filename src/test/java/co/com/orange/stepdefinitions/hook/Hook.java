package co.com.orange.stepdefinitions.hook;

import co.com.orange.hook.OpenWeb;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import org.hamcrest.Matchers;

import static co.com.orange.utils.Constants.TIME_SHORT;

import static co.com.orange.utils.Time.waiting;


public class Hook {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("{string} ingresa a Orange")
    public void OpenOrange(String actor) {
        OnStage.theActorCalled(actor).attemptsTo(
                OpenWeb.browserURL()
        );
        waiting(TIME_SHORT);
    }

}
