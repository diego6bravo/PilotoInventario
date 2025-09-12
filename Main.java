package JavaBasics.PilotoInventario;

public class Main {
    public static void main(String[] args) {
        // Usando Factory Method
        ProductoFactoryMethod factoryMethod = new ProductoFactoryMethod();
        Producto p1 = factoryMethod.crearProducto("alimento", "Manzana", 1.5);
        Producto p2 = factoryMethod.crearProducto("electronico", "Laptop", 1500.0);

        // Usando Builder
        Producto p3 = new ProductoBuilder()
                .setNombre("Silla Gamer")
                .setPrecio(250.0)
                .setCategoria("Muebles")
                .build();

        // Usando Prototype (clonando un producto)
        ProductoPrototype prototipo = new ProductoPrototype(p1);
        Producto p4 = prototipo.clonar();

        // Singleton de Inventario
        InventarioSingleton inventario = InventarioSingleton.getInstancia();
        inventario.getInventario().agregarProducto(p1);
        inventario.getInventario().agregarProducto(p2);
        inventario.getInventario().agregarProducto(p3);
        inventario.getInventario().agregarProducto(p4);

        // Mostrar inventario
        inventario.getInventario().listarProductos();

        // Usando Abstract Factory
        FabricaAbstracta fabricaAlimentos = new FabricaAlimentos();
        Producto alimento = fabricaAlimentos.crearProducto("Pan", 0.8);

        FabricaAbstracta fabricaElectronicos = new FabricaElectronicos();
        Producto electronico = fabricaElectronicos.crearProducto("Celular", 800.0);

        System.out.println("Abstract Factory creó: " + alimento.getNombre() + " y " + electronico.getNombre());
    }
}
