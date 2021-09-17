package Decarator.DecoratorOwn;

import Decarator.DecoratorOwn.decorators.CamisaDecorator;
import Decarator.DecoratorOwn.decorators.PantalonesDecorator;
import Decarator.DecoratorOwn.decorators.PersonaVestimenta;
import Decarator.DecoratorOwn.decorators.PersonaVestimentaImpl;

public class Demo {
    public static void main(String[] args) {
        PersonaVestimenta obj = new PantalonesDecorator(new CamisaDecorator(new PersonaVestimentaImpl()));
        System.out.println(obj.usaRopa());
    }
}
