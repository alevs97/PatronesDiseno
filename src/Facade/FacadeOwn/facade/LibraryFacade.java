package Facade.FacadeOwn.facade;

import Facade.FacadeOwn.library.Estado;
import Facade.FacadeOwn.library.Navegacion;
import Facade.FacadeOwn.library.Render;

public class LibraryFacade {
    Estado estado;
    public void estadoApp(int option){
        switch (option){
            case 1:
                System.out.println("Opcion 1 de estado");
                estado = new Estado(Render.ABLE, Navegacion.POSITION);
                System.out.println("Navegacion posicional Activada");
                break;
            case 2:
                System.out.println("Opcion 2 de estado");
                estado = new Estado(Render.ABLE, Navegacion.STATIC);
                System.out.println("Navegacion estatica Activada");
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }
}
