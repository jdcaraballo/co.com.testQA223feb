package co.com.testQA21feb.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ClickButtonsUser {
    public static final Target BTN_ELEMENTS =Target.the("BOTON ELEMENTS").locatedBy("//div[@class='card-body' and contains(.,'Elements')]");
    public static final Target BTN_BUTTONS =Target.the("BOTON BUTTON").locatedBy("//*[@class='text' and contains(.,'Buttons')]");
    public static final Target BTN_DOUBLE_CLICK =Target.the("BOTON DOBLE CLICK").locatedBy("//*[@id='doubleClickBtn' and contains(.,'Double Click Me')]");
    public static final Target BTN_CLICK_RIGHT =Target.the("BOTON RIGHT CLICK").locatedBy("//*[@id='rightClickBtn' and contains(.,'Right Click Me')]");
    public static final Target BTN_CLICK =Target.the("BOTON  CLICK").locatedBy("(//*[contains(text(),'Click Me')])[3]");
}
