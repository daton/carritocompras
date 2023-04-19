package educarvr.carritocompras.domain;

public class Verdura extends Producto{
   boolean empaquetada;

    public Verdura(boolean empaquetada) {
        this.empaquetada = empaquetada;
    }

    @Override
    public String toString() {
        return "Verdura{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
