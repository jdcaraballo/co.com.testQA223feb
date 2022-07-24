package co.com.testQA21feb.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.testQA21feb.userinterface.ValCheckBox.VAL_CHECKBOX;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ValCheckBox implements Question {
    @Override
    public Boolean answeredBy(Actor actor) {
        if(VAL_CHECKBOX.resolveFor(actor).isVisible())
        return true;
        return false;
    }

    public static ValCheckBox enPagina(){
        return new ValCheckBox();
    }
}
