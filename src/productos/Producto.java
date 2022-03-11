package productos;

public abstract class Producto implements Comparable<Object> {
	protected final String nombre;
	//Por qué es el precio es un int?
	protected final int precio;
	protected static final String SEPARADOR = " /// ";
	//Para qué el constructor?
	protected Producto(String nombre, int precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	//Se usan todos los metodos?
	public String getNombre() {
		return nombre;
	}
	public int getPrecio() {
		return precio;
	}

	@Override
	public int compareTo(Object o) {
		Producto obj = (Producto) o;

		/*
		 * Si el precio del producto es menor que el precio de Obj retorna el resultado en
		 * un (numero negativo), si es mayor retorna el resultado en un numero positivo
		 */
		return (this.precio - obj.getPrecio());
	}

	public abstract String toString();

}
