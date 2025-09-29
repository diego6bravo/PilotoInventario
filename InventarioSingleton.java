package JavaBasics.PilotoInventario;

public class InventarioSingleton {
    private static Inventario instancia;

    private InventarioSingleton() {}

    public static Inventario getInstancia() {
        if (instancia == null) {
            instancia = new Inventario();
        }
        return instancia;
    }
}
