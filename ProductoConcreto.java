package JavaBasics.PilotoInventario;

import java.util.HashMap; // 
import java.util.Map;   // módulo de mapeo de distintos tipos de datos (¿TDA?)
import java.util.UUID;  // módulo generardor de ID aleatorio

public class ProductoConcreto implements Producto { // Clase para instanciar productos implementando la interfaz 'Producto'
    private String nombre;      // atributos de Clase
    private double precio;
    private int cantidad;
    private Map<String, Object> atributos;  // tipo de dato compuesto
    private String sku;

    public ProductoConcreto(String nombre, double precio, int cantidad) {   // método constructor de productos concretos
        this.nombre = nombre;   // asignando argumentos como atributos del objeto de tipo ProductoConcreto
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
    public Producto clonar() {                      // Método concreto para clonar productos
        ProductoConcreto copia = new ProductoConcreto(  // Instanciación de la copia
            this.nombre + " (copia)",   
            this.precio,
            0
        );
        copia.atributos = new HashMap<>(this.atributos);    
        copia.sku = generarSku();
        return copia;           // devuelve el objeto clonado
    }
    
    // Falta sobreescribir la el método getCategoria();

    private String generarSku() {   // método para generar ID aleatorio
        return "SKU-" + UUID.randomUUID().toString().substring(0, 8);
    }

    @Override
    public String toString() {  
        return nombre + " | Precio: " + precio + " | Cantidad: " + cantidad + " | SKU: " + sku;
    }
}