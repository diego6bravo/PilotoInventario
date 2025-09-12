package JavaBasics.PilotoInventario;

public class ProductoBuilder {
    private String nombre;
    private double precio;
    private String categoria;

    public ProductoBuilder setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public ProductoBuilder setPrecio(double precio) {
        this.precio = precio;
        return this;
    }

    public ProductoBuilder setCategoria(String categoria) {
        this.categoria = categoria;
        return this;
    }

    public Producto build() {
        return new ProductoConcreto(nombre, precio, categoria);
    }
}
