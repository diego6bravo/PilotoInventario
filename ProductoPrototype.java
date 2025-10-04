package JavaBasics.PilotoInventario;
    
public class ProductoPrototype {   // Clase para crear objetos prototípicos.
    private ProductoConcreto prototipo;    // objeto base.

    public ProductoPrototype(Producto producto) {
        this.prototipo = new ProductoConcreto(     // adaptación del prototipo al objeto asignado como argumento.
                producto.getNombre(),       // tomar nombre del producto ingresado
                producto.getPrecio(),       // tomar nombre del precio ingresado
                producto.getCategoria()     // tomar nombre del categoría ingresado
        );
    }

    public Producto clonar() {          // método para clonar prototipos
        return new ProductoConcreto(
                prototipo.getNombre(),
                prototipo.getPrecio(),
                prototipo.getCategoria()
        );
    }
}
