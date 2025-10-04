package JavaBasics.PilotoInventario;

public class FabricaElectronicos implements FabricaAbstracta {     // Implementación de la Clase 'FrabricaAbstracta'
    @Override
    public Producto crearProducto() {          // Se sobreescribe y extiendo el método abstracto heredado, para crear un producto.
        return new ProductoConcreto("Electrónico", 200, 10);    // devuelve una instancia de 'ProductoConcreto'
    }
}
