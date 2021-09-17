package Factory.FactoryOwn.pelota;

public class Soccer implements Pelota{

    @Override
    public void playWith() {
        System.out.println("Se juega con el pie");
    }
}
