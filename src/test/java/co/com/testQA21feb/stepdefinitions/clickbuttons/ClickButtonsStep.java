package co.com.testQA21feb.stepdefinitions.clickbuttons;

import co.com.testQA21feb.interactions.HomePage;
import co.com.testQA21feb.tasks.ClickButtons;
import co.com.testQA21feb.tasks.IntroDemoSite;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.actors.OnStage;

public class ClickButtonsStep {

    @Given("^que (.*) esta en la pagina$")
    public void queDavidEstaEnLaPagina(String actor) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                HomePage.enPagina()
        );
        OnStage.theActorInTheSpotlight().attemptsTo(
                IntroDemoSite.enPagina()
        );
    }

    @When("^el da clicks en diferentes cotones$")
    public void elDaClicksEnDiferentesCotones() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                ClickButtons.enPagina()
        );

    }

    @Then("^entonces se vera mensaje de click Ok$")
    public void entoncesSeVeraMensajeDeClickOk() {

    }

}
