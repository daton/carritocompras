package educarvr.carritocompras.domain;

public class Libro extends Producto{
    String titulo;

    public Libro(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
