package co.com.testQA21feb.tasks;

import co.com.testQA21feb.interactions.esperas.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.testQA21feb.userinterface.RadioButtonUser.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RadioButton implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(BTN_ELEMENTS),
                Click.on(BTN_ELEMENTS),
                Click.on(BTN_RADIOBUTTON),
                Click.on(BTN_RADIO_BUTTON_YES),
                Esperar.unTiempo(5000)
        );
    }
    public  static RadioButton enPagina(){
        return instrumented(RadioButton.class);
    }
}
