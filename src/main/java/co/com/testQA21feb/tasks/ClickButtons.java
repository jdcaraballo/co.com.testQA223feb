package co.com.testQA21feb.tasks;

import co.com.testQA21feb.interactions.esperas.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.DoubleClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


import static co.com.testQA21feb.userinterface.ClickButtonsUser.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickButtons implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(BTN_ELEMENTS),
                Click.on(BTN_ELEMENTS),
                Scroll.to(BTN_BUTTONS),
                Click.on(BTN_BUTTONS),
                DoubleClick.on(BTN_DOUBLE_CLICK),
                ContextClick(BTN_CLICK_RIGHT),
                //ContextClick(BTN_CLICK_RIGHT),
                Click.on(BTN_CLICK),
                Esperar.unTiempo(5000)

        );

    }


    private ClickButtons ContextClick(Target btnClickRight) {
    return instrumented(ClickButtons.class,btnClickRight);}

    public static ClickButtons enPagina() {
    return instrumented(ClickButtons.class);}

}
