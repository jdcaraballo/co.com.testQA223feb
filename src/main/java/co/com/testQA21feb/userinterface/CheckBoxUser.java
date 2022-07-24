package co.com.testQA21feb.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class CheckBoxUser {
    public static final Target BOTON_ELEMENTS=Target.the("BOTON para ELEMENTS").locatedBy("(//*[contains(text(),'Elements')])[2]");
    public static final Target BOTON_CHECKBOX=Target.the("BOTON para CheckBox").locatedBy("//*[@id='item-1' and contains(.,'Check Box')]");
    public static final Target LIST_CHECKBOX=Target.the("Lista para CheckBox").locatedBy("//*[@id='tree-node']/ol/li/span/button");
    public static final Target BOX_DESKTOP=Target.the("Lista para DESKTOP").locatedBy("//*[@class='rct-title' and contains(.,'Desktop')]");
    public static final Target BOX_DOCUMENTS=Target.the("Lista para DOCUMENTS").locatedBy("(//*[@class='rct-text']//*[@type='button'])[3]");
    public static final Target BOX_WORKSPACE=Target.the("Lista para WORKSPACE").locatedBy("//*[@class='rct-title' and contains(.,'WorkSpace')]");
    public static final Target BOX_OFFICE=Target.the("Lista para WORKSPACE").locatedBy("(//*[@class='rct-text']//*[@type='button'])[5]");
    public static final Target BOX_PUBLIC=Target.the("Lista para PUBLICO").locatedBy("//*[@class='rct-title' and contains(.,'Public')]");
    public static final Target BOX_GENERAL=Target.the("Lista para GENERAL").locatedBy("//*[@class='rct-title' and contains(.,'General')]");
}
