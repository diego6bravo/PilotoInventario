package JavaBasics.PilotoInventario;

public class ProductoBuilder {
    private String nombre;
    private double precio;
    private int cantidad;

    public ProductoBuilder setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public ProductoBuilder setPrecio(double precio) {
        this.precio = precio;
        return this;
    }

    public ProductoBuilder setCantidad(int cantidad) {
        this.cantidad = cantidad;
        return this;
    }

    public Producto build() {
        return new ProductoConcreto(nombre, precio, cantidad);
    }
}
