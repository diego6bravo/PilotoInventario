package JavaBasics.PilotoInventario;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ProductoConcreto implements Producto {
    private String nombre;
    private double precio;
    private int cantidad;
    private Map<String, Object> atributos;
    private String sku;

    public ProductoConcreto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.atributos = new HashMap<>();
        this.sku = generarSku();
    }

    @Override
    public String getNombre() { return nombre; }

    @Override
    public double getPrecio() { return precio; }

    @Override
    public Producto clonar() {
        ProductoConcreto copia = new ProductoConcreto(
            this.nombre + " (copia)",
            this.precio,
            0
        );
        copia.atributos = new HashMap<>(this.atributos);
        copia.sku = generarSku();
        return copia;
    }

    private String generarSku() {
        return "SKU-" + UUID.randomUUID().toString().substring(0, 8);
    }

    @Override
    public String toString() {
        return nombre + " | Precio: " + precio + " | Cantidad: " + cantidad + " | SKU: " + sku;
    }
}
