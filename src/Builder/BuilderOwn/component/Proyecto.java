package Builder.BuilderOwn.component;

public class Proyecto {

    private String nombre;

    public Proyecto(String nombre){
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Proyecto{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
