package productos;

public class Bebida extends Producto {
	private double litros;

	public Bebida(String nombre, int precio, double litros) {
		super(nombre, precio);
		this.litros = litros;
	}

	@Override
	public String toString() {
		String separador = " /// ";
		return "Nombre: " + getNombre() + separador + "Litros: "
				+ String.format("%.1f", litros) + separador + "Precio: $"
				+ (int) getPrecio();
	}

}
