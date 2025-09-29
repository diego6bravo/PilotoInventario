package JavaBasics.PilotoInventario;

public interface Producto {
    String getNombre();
    double getPrecio();
    String getCategoria();
    Producto clonar();
}

