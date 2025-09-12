package JavaBasics.PilotoInventario;

public class ProductoFactoryMethod {
    public Producto crearProducto(String tipo, String nombre, double precio) {
        switch (tipo.toLowerCase()) {
            case "alimento":
                return new ProductoConcreto(nombre, precio, "Alimento");
            case "electronico":
                return new ProductoConcreto(nombre, precio, "Electrónico");
            default:
                return new ProductoConcreto(nombre, precio, "General");
        }
    }
}

