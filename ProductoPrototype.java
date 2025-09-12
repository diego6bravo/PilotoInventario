package JavaBasics.PilotoInventario;

public class ProductoPrototype {
    private ProductoConcreto prototipo;

    public ProductoPrototype(Producto producto) {
        this.prototipo = new ProductoConcreto(
                producto.getNombre(),
                producto.getPrecio(),
                producto.getCategoria()
        );
    }

    public Producto clonar() {
        return new ProductoConcreto(
                prototipo.getNombre(),
                prototipo.getPrecio(),
                prototipo.getCategoria()
        );
    }
}
