package co.com.testQA21feb.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.testQA21feb.userinterface.ValRadioButton.VAL_RADIO_BUTTON;

public class ValRadioButtonQ implements Question {
    @Override
    public Boolean answeredBy(Actor actor) {
        if(VAL_RADIO_BUTTON.resolveFor(actor).isVisible())
        return true;
        return false;
    }

    public static ValRadioButtonQ enPagina(){
        return new ValRadioButtonQ();
    }
}
