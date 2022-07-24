package co.com.testQA21feb.stepdefinitions.checkbox;

import co.com.testQA21feb.interactions.HomePage;
import co.com.testQA21feb.questions.ValCheckBox;
import co.com.testQA21feb.tasks.CheckBox;
import co.com.testQA21feb.tasks.IntroDemoSite;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

public class CheckBoxStep {

    @Given("^que (.*) esta en la pagina$")
    public void queDavidEstaEnLaPagina(String actor) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                HomePage.enPagina()
        );
        OnStage.theActorInTheSpotlight().attemptsTo(
                IntroDemoSite.enPagina()
        );
    }

    @When("^el Checkea dos box$")
    public void elCheckeaBox() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                CheckBox.enPagina()
        );
   }

    @Then("^se vera mensaje de check Ok$")
    public void seVeraMensajeDeCheckOk() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValCheckBox.enPagina()));

    }
}
