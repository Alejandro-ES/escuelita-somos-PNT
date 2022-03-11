package productos;

public class Bebida extends Producto {
    private final double litros;

    public Bebida(String nombre, int precio, double litros) {
        super(nombre, precio);
        this.litros = litros;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + SEPARADOR + "Litros: "
                + String.format("%.1f", litros) + SEPARADOR + "Precio: $"
                + precio;
    }

}
