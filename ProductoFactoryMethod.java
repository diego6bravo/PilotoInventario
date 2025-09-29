package JavaBasics.PilotoInventario;

public class ProductoFactoryMethod {
    public static Producto crearProducto(String tipo) {
        switch (tipo.toLowerCase()) {
            case "electronico":
                return new ProductoConcreto("Electrónica genérica", 1000, 5);
            case "alimento":
                return new ProductoConcreto("Alimento genérico", 50, 20);
            case "ropa":
                return new ProductoConcreto("Prenda genérica", 80, 15);
            default:
                throw new IllegalArgumentException("Tipo de producto no soportado: " + tipo);
        }
    }
}
