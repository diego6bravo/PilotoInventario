package JavaBasics.PilotoInventario;

public class FabricaAlimentos implements FabricaAbstracta {
    @Override
    public Producto crearProducto() {
        return new ProductoConcreto("Alimento", 20, 100);
    }
}
