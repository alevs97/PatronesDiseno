package Factory.FactoryExample.factory;

import Factory.FactoryExample.buttons.Button;
import Factory.FactoryExample.buttons.HtmlButton;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
