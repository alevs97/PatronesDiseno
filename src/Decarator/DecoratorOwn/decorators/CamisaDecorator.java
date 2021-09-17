package Decarator.DecoratorOwn.decorators;

public class CamisaDecorator extends PersonaDecorador{
    public CamisaDecorator(PersonaVestimenta wrapper) {
        super(wrapper);
    }

    @Override
    public String usaRopa() {
        return super.usaRopa() + usaCamisa();
    }

    private String usaCamisa(){
        return "\nUsa Camisa";
    }
}
