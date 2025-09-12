package JavaBasics.PilotoInventario;

public class ProductoConcreto implements Producto {
    private String nombre;
    private double precio;
    private String categoria;

    public ProductoConcreto(String nombre, double precio, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public String getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return nombre + " - $" + precio + " (" + categoria + ")";
    }
}
