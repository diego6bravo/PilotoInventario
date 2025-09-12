package JavaBasics.PilotoInventario;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void listarProductos() {
        System.out.println("Inventario de productos:");
        for (Producto p : productos) {
            System.out.println(" - " + p.toString());
        }
    }
}
