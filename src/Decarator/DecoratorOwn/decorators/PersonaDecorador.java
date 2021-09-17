package Decarator.DecoratorOwn.decorators;

public abstract class PersonaDecorador implements PersonaVestimenta{

    private PersonaVestimenta wrapper;

    protected PersonaDecorador(PersonaVestimenta wrapper) {
        this.wrapper = wrapper;
    }

    @Override
    public String usaRopa() {
        return wrapper.usaRopa();
    }
}
