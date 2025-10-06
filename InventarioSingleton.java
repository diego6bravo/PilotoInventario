package JavaBasics.PilotoInventario;

public class InventarioSingleton {
    private static Inventario instancia; // Este es una variable estática que almacena la única instancia de la clase Inventario.

    private InventarioSingleton() {} // Este es un constructor privado que evita que la clase InventarioSingleton se instancie desde fuera de la clase.

    /**
     * Devuelve la instancia única de Inventario.
     * Si no ha sido creado anteriormente, se crea una nueva instancia.
     * retorna la instancia única de Inventario.
     */

    public static Inventario getInstancia() {  // Este método devuelve la única instancia de la clase Inventario. Si la instancia aún no ha sido creada, se crea una nueva instancia y se asigna a la variable instancia.
        if (instancia == null) {
            instancia = new Inventario();
        }
        return instancia;
    }
}
