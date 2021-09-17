package Factory.FactoryOwn.factory;

import Factory.FactoryOwn.pelota.Pelota;

public abstract class Dialog{
    public void creadorPelota(){
        Pelota pelota = createPelota();
        pelota.playWith();
    }

    public abstract Pelota createPelota();
}
