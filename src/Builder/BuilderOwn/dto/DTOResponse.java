package Builder.BuilderOwn.dto;

import Builder.BuilderOwn.component.Compania;
import Builder.BuilderOwn.component.Proyecto;
import Builder.BuilderOwn.component.Puesto;
import Builder.BuilderOwn.component.Trabajador;

public class DTOResponse {
    private Compania compania;
    private Proyecto proyecto;
    private Puesto puesto;
    private Trabajador trabajador;

    public DTOResponse(Compania compania, Proyecto proyecto, Puesto puesto, Trabajador trabajador) {
        this.compania = compania;
        this.proyecto = proyecto;
        this.puesto = puesto;
        this.trabajador = trabajador;
    }

    public void getInfo(){
        System.out.println("Info del empleado: " + "\n"+
                compania.toString() + "\n"+
                proyecto.toString() + "\n"+
                puesto.toString() + "\n"+
                trabajador.toString() + "\n");
    }

    public Compania getCompania() {
        return compania;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }
}
