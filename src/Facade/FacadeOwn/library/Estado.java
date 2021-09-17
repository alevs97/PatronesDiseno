package Facade.FacadeOwn.library;

public class Estado {
    private Render render;
    private Navegacion navegacion;

    public Estado(Render render,Navegacion navegacion){
        this.render = render;
        this.navegacion = navegacion;
        stateApp();
    }

    private void stateApp() {
        if(Render.ABLE == render){
            System.out.println("State will keep it");
        }else{
            System.out.println("State will not keep it");
        }

        switch (navegacion){
            case NAMES:
                System.out.println("Navegacion por nombres");
                break;
            case POSITION:
                System.out.println("Navegaion por position");
                break;
            case DINAMIC:
                System.out.println("Navegacion dinamica");
                break;
            default:
                System.out.println("Navegacion estatica");
                break;
        }
    }

}
