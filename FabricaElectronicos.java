package JavaBasics.PilotoInventario;

public class FabricaElectronicos implements FabricaAbstracta {
    @Override
    public Producto crearProducto(String nombre, double precio) {
        return new ProductoConcreto(nombre, precio, "Electrónico");
    }
}
