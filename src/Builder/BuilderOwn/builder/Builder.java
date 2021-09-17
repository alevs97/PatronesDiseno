package Builder.BuilderOwn.builder;

import Builder.BuilderOwn.component.Compania;
import Builder.BuilderOwn.component.Proyecto;
import Builder.BuilderOwn.component.Puesto;
import Builder.BuilderOwn.component.Trabajador;

public interface Builder {
    void setCompania(Compania compania);
    void setProyecto(Proyecto proyecto);
    void setPuesto(Puesto puesto);
    void setTrabajador(Trabajador trabajador);
}
