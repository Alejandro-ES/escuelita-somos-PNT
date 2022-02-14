package productos;

public class Producto implements Comparable<Object> {
	private String nombre;
	private int precio;

	public Producto(String nombre, int precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public int compareTo(Object o) {
		Producto Obj = (Producto) o;

		/*
		 * Si el precio del producto es menor que el precio de Obj retorna el resultado en
		 * un (numero negativo), si es mayor retorna el resultado en un numero positivo
		 */
		return (int) (this.precio - Obj.getPrecio());
	}

}
