package co.com.testQA21feb.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class RadioButtonUser {
    public static final Target BTN_ELEMENTS =Target.the("BOTON ELEMENTS ").locatedBy("//*[@class='card-body' and contains(.,'Elements')]");
    public static final Target BTN_RADIOBUTTON =Target.the("BOTON RADIOBUTTON ").locatedBy("//*[@class='text' and contains(.,'Radio Button')]");
    public static final Target BTN_RADIO_BUTTON_YES =Target.the("BOTON RadioButton ").locatedBy("//*[@class='custom-control-label' and contains(.,'Yes')]");
}
