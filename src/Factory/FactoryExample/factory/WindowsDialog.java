package Factory.FactoryExample.factory;

import Factory.FactoryExample.buttons.Button;
import Factory.FactoryExample.buttons.WindowsButton;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}

