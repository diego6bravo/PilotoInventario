
/**
 * Este paquete contiene las clases y interfaces relacionadas con el inventario de productos.
 * Se utiliza el patrón de diseño Abstract Factory para crear productos concretos según su categoría.
 * Además, se utilizan otros patrones como Builder, Factory Method y Singleton.
 * 
 * Clases principales:
 * - Producto: Interfaz común para todos los objetos que instanciará la clase y las subclases creadoras.
 * - ProductoConcreto: Implementación de la interfaz Producto.
 * - ProductoBuilder: Construcción paso a paso de objetos Producto.
 * - ProductoFactoryMethod: Crea productos según su categoría.
 * - FabricaAbstracta: Interfaz de fábricas concretas.
 * - FabricaAlimentos: Fábrica concreta para alimentos.
 * - FabricaElectronicos: Fábrica concreta para electrónicos.
 * - ProductoPrototype: Clase para clonar productos existentes.
 * - CreadorConcreto: Clase que extiende la clase ProductoFactoryMethod.
 * - InventarioSingleton: Clase Singleton que gestiona el inventario global.
 * 
 * Documentación de las clases:
 * - Producto: Interfaz común para todos los objetos que instanciará la clase y las subclases creadoras.
 * - ProductoConcreto: Implementación de la interfaz Producto.
 * - ProductoBuilder: Construcción paso a paso de objetos Producto.
 * - ProductoFactoryMethod: Crea productos según su categoría.
 * - FabricaAbstracta: Interfaz de fábricas concretas.
 * - FabricaAlimentos: Fábrica concreta para alimentos.
 * - FabricaElectronicos: Fábrica concreta para electrónicos.
 * - ProductoPrototype: Clase para clonar productos existentes.
 * - CreadorConcreto: Clase que extiende la clase ProductoFactoryMethod.
 * - InventarioSingleton: Clase Singleton que gestiona el inventario global.
 */


package JavaBasics.PilotoInventario;

/**
 * @authors Diego García, David Velasco.
 */

public class Main {     // Clase principal desde la que se instancian los Productos y se gestiona el inventario
    public static void main(String[] args) {
        // Crear producto original
        ProductoConcreto laptop = new ProductoConcreto("Laptop", 2500, 10);
        
        ProductoConcretoCorregido tablet = new ProductoConcretoCorregido("Tablet", "electrónica", 1000, 7);

        // Clonar producto usando Prototype
        Producto laptopCopia = laptop.clonar();
        
        Producto tabletCopia = tablet.clonar();

        // Usar Singleton para gestionar inventario
        Inventario inventario = InventarioSingleton.getInstancia();
        inventario.agregarProducto(laptop);
        inventario.agregarProducto(laptopCopia);
        
        inventario.agregarProducto(tablet);
        inventario.agregarProducto(tabletCopia);

        // Listar productos
        for (Producto p : inventario.listarProductos()) {
            System.out.println(p);
        }
    }
}
