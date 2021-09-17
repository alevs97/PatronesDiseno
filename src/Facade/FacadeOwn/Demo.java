package Facade.FacadeOwn;

import Facade.FacadeOwn.facade.LibraryFacade;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner opc = new Scanner(System.in);

        System.out.println("Que implentacion de navegacion de implementara (1 -2)");
        int navOpc = opc.nextInt();

        LibraryFacade lib = new LibraryFacade();
        lib.estadoApp(navOpc);
    }
}
