package JavaBasics.PilotoInventario;

import java.util.HashMap;
import java.util.Map;   // módulo de mapeo de distintos tipos de datos (¿TDA?)
import java.util.UUID;  // módulo generardor de ID aleatorio

public class ProductoConcretoCorregido implements Producto { // Clase para instanciar productos implementando la interfaz 'Producto'   
    private String nombre;      // atributos de Clase
    private String categoria;
    private double precio;
    private int cantidad;
    private Map<String, Object> atributos;  // tipo de dato compuesto
    private String sku;

    public ProductoConcretoCorregido(String nombre, String categoria, double precio, int cantidad) {   // método constructor de productos concretos
        this.nombre = nombre;   // asignando argumentos como atributos del objeto de tipo ProductoConcreto
        this.categoria = categoria;
        this.precio = precio;
        this.cantidad = cantidad;
        this.atributos = new HashMap<>();
        this.sku = generarSku();
    }

    @Override
    public String getNombre() { return nombre; }    // Método concreto: sobreescribiendo y extendiendo método perteneciente a la interfaz 'Producto'

    @Override
    public double getPrecio() { return precio; }    // Método concreto
    
    @Override
    public String getCategoria() { return categoria; }  // Método concreto (Añadido)

    @Override
    public Producto clonar() {                      // Método concreto para clonar productos
        ProductoConcretoCorregido copia = new ProductoConcretoCorregido(  // Instanciación de la copia
            this.nombre + " (copia)",
            this.categoria,                                                             // (atributo 'categoria' añadido)
            this.precio,
            0
        );
        copia.atributos = new HashMap<>(this.atributos);
        copia.sku = generarSku();
        return copia;           // devuelve el objeto clonado
    }

    private String generarSku() {   // método para generar ID aleatorio
        return "SKU-" + UUID.randomUUID().toString().substring(0, 8);
    }

    @Override
    public String toString() {
        return nombre + " | Precio: " + precio + " | Cantidad: " + cantidad + " | SKU: " + sku;
    }
}
