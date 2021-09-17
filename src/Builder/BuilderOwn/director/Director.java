package Builder.BuilderOwn.director;

import Builder.BuilderOwn.builder.Builder;
import Builder.BuilderOwn.component.Compania;
import Builder.BuilderOwn.component.Proyecto;
import Builder.BuilderOwn.component.Puesto;
import Builder.BuilderOwn.component.Trabajador;

public class Director {

    public void constructorCTO(Builder builder){
        builder.setCompania(new Compania("Walmart"));
        builder.setPuesto(new Puesto("CTO",20000));
        builder.setTrabajador(new Trabajador(54,"Mauricio"));
    }

    public void constructorDesarrolladores(Builder builder){
        builder.setTrabajador(new Trabajador(23,"Chema"));
        builder.setPuesto(new Puesto("Desarrollador",21222));
        builder.setProyecto(new Proyecto("Desarrollo aplicacion"));
        builder.setCompania(new Compania("Walmart"));
    }
}
