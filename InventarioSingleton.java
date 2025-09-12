package JavaBasics.PilotoInventario;

public class InventarioSingleton {
    private static InventarioSingleton instancia;
    private Inventario inventario;

    private InventarioSingleton() {
        inventario = new Inventario();
    }

    public static InventarioSingleton getInstancia() {
        if (instancia == null) {
            instancia = new InventarioSingleton();
        }
        return instancia;
    }

    public Inventario getInventario() {
        return inventario;
    }
}
