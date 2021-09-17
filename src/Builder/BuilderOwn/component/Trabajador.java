package Builder.BuilderOwn.component;

public class Trabajador {
    private int edad;
    private String nombre;
    private boolean activo;

    public Trabajador(int edad, String nombre){
        this.edad = edad;
        this.nombre = nombre;
    }

    public void despedido(){
        activo = false;
    }

    public void trabajando(){
        activo = true;
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", activo=" + activo +
                '}';
    }
}
