package JavaBasics.PilotoInventario;

import java.util.ArrayList; // módulos para crear y operar listas
import java.util.List;      

public class Inventario {   // Clase para crear inventarios
    private List<Producto> productos = new ArrayList<>();   // Creando lista que recibirá objetos de tipo Producto

    public void agregarProducto(Producto p) {   // Método para agregar productos al inventario
        productos.add(p); 
    }

    public List<Producto> listarProductos() {   // método para listar el inventario
        return productos;   // devuelve la lista de los productos dentro del inventario
    }
}
