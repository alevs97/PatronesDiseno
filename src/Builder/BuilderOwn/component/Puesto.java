package Builder.BuilderOwn.component;

public class Puesto {
    private String nombre;
    private double salario;

    public Puesto(String nombre, double salario){
        this.nombre = nombre;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Puesto{" +
                "nombre='" + nombre + '\'' +
                ", salario=" + salario +
                '}';
    }
}
