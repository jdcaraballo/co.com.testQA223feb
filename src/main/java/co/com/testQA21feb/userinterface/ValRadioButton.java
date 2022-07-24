package co.com.testQA21feb.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class ValRadioButton {
    public static final Target VAL_RADIO_BUTTON = Target.the("VALIDACION DE RADIOBUTTON").locatedBy("//*[@class='mt-3' and contains(.,'You have selected')]");
}
