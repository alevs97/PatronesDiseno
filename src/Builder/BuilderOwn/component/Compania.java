package Builder.BuilderOwn.component;

public class Compania {
    private String nombre;

    public Compania(String nombre){
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Compania{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
