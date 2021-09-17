package Factory.FactoryOwn.factory;

import Factory.FactoryOwn.pelota.Pelota;
import Factory.FactoryOwn.pelota.Soccer;

public class SoccerDialog extends Dialog{

    @Override
    public Pelota createPelota() {
        return new Soccer();
    }
}
