package Factory.FactoryOwn;

import Factory.FactoryOwn.factory.Dialog;
import Factory.FactoryOwn.factory.SoccerDialog;
import Factory.FactoryOwn.factory.VolleyDialog;

import java.util.Scanner;

public class Demo {

    private static Dialog dialog;
    private static Scanner source = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Que te gustaria jugar \n" +
                "1 - Soccer \n2 - Volley");
        int aux = source.nextInt();
        System.out.println(aux);
        if(aux == 1){
            dialog = new SoccerDialog();
        }else{
            dialog = new VolleyDialog();
        }

        dialog.creadorPelota();
    }
}
