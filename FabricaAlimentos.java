package JavaBasics.PilotoInventario;

public class FabricaAlimentos implements FabricaAbstracta {     // Implementación de la Clase 'FrabricaAbstracta'
    @Override
    public Producto crearProducto() {       // Se sobreescribe y extiendo el método abstracto heredado, para crear un producto
        return new ProductoConcreto("Alimento", 20, 100);   // devuelve una instancia de 'ProductoConcreto'
    }
}
