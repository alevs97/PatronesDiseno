package Factory.FactoryExample.factory;

import Factory.FactoryExample.buttons.AlejandroButton;
import Factory.FactoryExample.buttons.Button;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class AlejandroDialog extends Dialog {

    @Override
    public Button createButton() {
        return new AlejandroButton();
    }
}

