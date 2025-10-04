package JavaBasics.PilotoInventario;

public class ProductoPrototypeCorregido{   // Clase para crear objetos prototípicos.  // !!!añadir la implementación de la interfaz 'Prototype'!!!
    private ProductoConcretoCorregido prototipo;    // objeto base.

    public ProductoPrototypeCorregido(Producto producto) {
        this.prototipo = new ProductoConcretoCorregido(     // adaptación del prototipo al objeto asignado como argumento.
                producto.getNombre(),   // tomar nombre.
                producto.getCategoria(),    // tomar categoría.
                producto.getPrecio(),   // tomar precio.
                0                       // tomar cantidad.
        );
    }

    public Producto clonar() {          // método para clonar prototipos
        return new ProductoConcretoCorregido(  
                prototipo.getNombre(),  
                prototipo.getCategoria(),
                prototipo.getPrecio(),
                0
        );
    }
}
