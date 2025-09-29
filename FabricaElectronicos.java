package JavaBasics.PilotoInventario;

public class FabricaElectronicos implements FabricaAbstracta {
    @Override
    public Producto crearProducto() {
        return new ProductoConcreto("Electrónico", 200, 10);
    }
}
