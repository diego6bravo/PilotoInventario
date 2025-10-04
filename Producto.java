package JavaBasics.PilotoInventario;

// Interfaz común para todos los objetos que instanciará la clase y las subclases creadoras
public interface Producto {
    String getNombre();     // Declaración de método para capturar y devolver el nombre del producto.
    double getPrecio();     // Declaración de método para capturar y devolver el precio del producto.
    String getCategoria();  // Declaración de método para capturar y devolver la categoría del producto.
    Producto clonar();      // Declaración de método para clonar objetos de la Clase 'Producto'.
}

