package Factory.FactoryOwn.factory;

import Factory.FactoryOwn.pelota.Pelota;
import Factory.FactoryOwn.pelota.Volley;

public class VolleyDialog extends Dialog{
    @Override
    public Pelota createPelota() {
        return new Volley();
    }
}
