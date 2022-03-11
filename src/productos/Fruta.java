package productos;

public class Fruta extends Producto {

	private final String unidadDeVenta;

	public Fruta(String nombre, int precio, String unidadDeVenta) {
		super(nombre, precio);
		this.unidadDeVenta = unidadDeVenta;
	}

	//Se te ocurre otra manera de implementarlo?
	@Override
	public String toString() {
		return "Nombre: " + nombre + SEPARADOR + "Precio: $" + precio
				+ SEPARADOR + "Unidad de venta: " + unidadDeVenta;
	}

}
