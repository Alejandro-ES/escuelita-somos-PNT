package supermercadoDeBarrio;

public class Supermercado {

	public static void main(String[] args) {
		ListaDeProductos listaProductos = new ListaDeProductos();

		listaProductos.cargarListaDeProductos();
		listaProductos.mostrarListaDeProductosPorConsola();
	}

}