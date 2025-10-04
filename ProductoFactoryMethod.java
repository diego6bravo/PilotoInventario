package JavaBasics.PilotoInventario;

// En vez de ingresar la  categoría manualmente, sería bueno tener un constructor de categorías
// y que los productos heredaran de una categoría.

// Creador de productos
public class ProductoFactoryMethod {

    public Producto crearProducto(String tipo) { // Método que devuelve objeto de tipo producto
        switch (tipo.toLowerCase()) {   // Comprobar el tipo de producto ingresado...
            case "electronico":         // si es electrónico
                return new ProductoConcreto("Electrónica genérica", 1000, 5);   // devuelve un objeto con la categoría 'electronico'
            case "alimento":            // si es un alimento...
                return new ProductoConcreto("Alimento genérico", 50, 20);   // devuelve un objeto con la categoría 'alimento'
            case "ropa":                // si es ropa...
                return new ProductoConcreto("Prenda genérica", 80, 15);     // devuelve un objeto con la categoría 'ropa'
            default:                    // si no se escribe la categoría...
                throw new IllegalArgumentException("Tipo de producto no soportado: " + tipo);   // lanza un error.
        }
    }
}