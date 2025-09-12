package JavaBasics.PilotoInventario;

public class FabricaAlimentos implements FabricaAbstracta {
    @Override
    public Producto crearProducto(String nombre, double precio) {
        return new ProductoConcreto(nombre, precio, "Alimento");
    }
}
