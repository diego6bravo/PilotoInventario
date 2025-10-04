package JavaBasics.PilotoInventario;

public class ProductoBuilder {  // clase constructora de productos
    private String nombre;  // atributos
    private double precio;
    private int cantidad;

    public ProductoBuilder setNombre(String nombre) {     // definir el nombre del producto
        this.nombre = nombre;   // asignando el nombre 'setteado' como atributo del objeto constructor de productos
        return this;    // devuelve el objeto de tipo 'productBuilder'
    }

    public ProductoBuilder setPrecio(double precio) {   // definir precio
        this.precio = precio;           // asignar precio definido al objeto constructor de productos
        return this;
    }

    public ProductoBuilder setCantidad(int cantidad) {  // definir cantidad
        this.cantidad = cantidad;           // asignar cantidad al objeto constructor de productos
        return this;
    }
    

    public Producto build() {       // constructor de productos
        return new ProductoConcreto(nombre, precio, cantidad);  // retorna un productoConcreto con los objetos constructores como argumentos
    }
}
