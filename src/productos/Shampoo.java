package productos;

public class Shampoo extends Producto {

    private final int contenidoMl;

    public Shampoo(String nombre, int precio, int contenidoMl) {
        super(nombre, precio);
        this.contenidoMl = contenidoMl;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + SEPARADOR + "Contenido: " + contenidoMl + "ml"
                + SEPARADOR + "Precio: $" + precio;
    }
}
