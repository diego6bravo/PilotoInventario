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
