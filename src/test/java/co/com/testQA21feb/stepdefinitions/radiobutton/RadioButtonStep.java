package co.com.testQA21feb.stepdefinitions.radiobutton;

import co.com.testQA21feb.interactions.HomePage;
import co.com.testQA21feb.questions.ValRadioButtonQ;
import co.com.testQA21feb.tasks.IntroDemoSite;
import co.com.testQA21feb.tasks.RadioButton;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

public class RadioButtonStep {
    @Given("^que (.*) esta en la pagina$")
    public void queDavidEstaEnLaPagina(String actor) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                HomePage.enPagina()
        );
        OnStage.theActorInTheSpotlight().attemptsTo(
                IntroDemoSite.enPagina()
        );
    }

    @When("^el da click en si$")
    public void elDaClickEnSi() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                RadioButton.enPagina()
        );

    }

    @Then("^se vera mensaje de si exitoso$")
    public void seVeraMensajeDeSiExitoso() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValRadioButtonQ.enPagina()));

    }

}
