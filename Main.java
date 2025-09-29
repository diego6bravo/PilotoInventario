package JavaBasics.PilotoInventario;

public class Main {
    public static void main(String[] args) {
        // Crear producto original
        ProductoConcreto laptop = new ProductoConcreto("Laptop", 2500, 10);

        // Clonar producto usando Prototype
        Producto laptopCopia = laptop.clonar();

        // Usar Singleton para gestionar inventario
        Inventario inventario = InventarioSingleton.getInstancia();
        inventario.agregarProducto(laptop);
        inventario.agregarProducto(laptopCopia);

        // Listar productos
        for (Producto p : inventario.listarProductos()) {
            System.out.println(p);
        }
    }
}
