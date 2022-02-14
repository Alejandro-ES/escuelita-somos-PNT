package productos;

public class Shampoo extends Producto {

	private int contenidoMl;

	public Shampoo(String nombre, int precio, int contenidoMl) {
		super(nombre, precio);
		this.contenidoMl = contenidoMl;
	}

	@Override
	public String toString() {
		String separador = " /// ";
		return "Nombre: " + getNombre() + separador + "Contenido: " + contenidoMl + "ml"
				+ separador + "Precio: $" + (int) getPrecio();
	}
}
