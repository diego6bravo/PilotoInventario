package JavaBasics.PilotoInventario;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public List<Producto> listarProductos() {
        return productos;
    }
}
