package Decarator.DecoratorOwn.decorators;

public class PantalonesDecorator extends PersonaDecorador{

    public PantalonesDecorator(PersonaVestimenta personaVestimenta){
        super(personaVestimenta);
    }

    @Override
    public String usaRopa() {
        return super.usaRopa() + usaPantalones() ;
    }

    private String usaPantalones(){
        return "\nUsa Pantalones";
    }
}
