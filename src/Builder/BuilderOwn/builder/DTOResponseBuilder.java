package Builder.BuilderOwn.builder;

import Builder.BuilderOwn.component.Compania;
import Builder.BuilderOwn.component.Proyecto;
import Builder.BuilderOwn.component.Puesto;
import Builder.BuilderOwn.component.Trabajador;
import Builder.BuilderOwn.dto.DTOResponse;

public class DTOResponseBuilder implements Builder{

    private Compania compania;
    private Proyecto proyecto;
    private Puesto puesto;
    private Trabajador trabajador;

    @Override
    public void setCompania(Compania compania) {
        this.compania = compania;
    }

    @Override
    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    @Override
    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }

    @Override
    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

    public DTOResponse getResult() {
        return new DTOResponse(compania,proyecto,puesto,trabajador);
    }
}
