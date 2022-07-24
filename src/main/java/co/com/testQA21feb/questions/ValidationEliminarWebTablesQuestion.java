package co.com.testQA21feb.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.testQA21feb.userinterface.ValidationEliminarWebTablesUser.VALIDATION_DELETE;

public class ValidationEliminarWebTablesQuestion implements Question {
    @Override
    public Boolean answeredBy(Actor actor) {
    if(VALIDATION_DELETE.resolveFor(actor).isVisible())
        return false;
        return true;

    }
    public static ValidationEliminarWebTablesQuestion validationEliminarWebTablesQuestion(){
        return new ValidationEliminarWebTablesQuestion();
    }
}
