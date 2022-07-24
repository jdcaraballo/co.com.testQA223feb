package co.com.testQA21feb.tasks;

import co.com.testQA21feb.interactions.esperas.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.testQA21feb.userinterface.CheckBoxUser.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CheckBox implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(BOTON_ELEMENTS),
                Click.on(BOTON_ELEMENTS),
                Scroll.to(BOTON_CHECKBOX),
                Click.on(BOTON_CHECKBOX),
                Click.on(LIST_CHECKBOX),
                Click.on(BOX_DESKTOP),
                Click.on(BOX_DOCUMENTS),
                Click.on(BOX_WORKSPACE),
                Click.on(BOX_OFFICE),
                Click.on(BOX_PUBLIC),
                Scroll.to(BOX_GENERAL),
                Click.on(BOX_GENERAL),
                Esperar.unTiempo(10000)

        );
    }
    public static CheckBox enPagina(){
        return instrumented(CheckBox.class);
    }
}
