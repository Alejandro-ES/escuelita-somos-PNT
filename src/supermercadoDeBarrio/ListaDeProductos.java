package supermercadoDeBarrio;

import java.util.ArrayList;

import productos.*;

public class ListaDeProductos {
	private ArrayList<Producto> lista;

	public void cargarListaDeProductos() {
		lista = new ArrayList<Producto>();
		Bebida bebida1 = new Bebida("Coca-Cola Zero", 20, 1.5);
		Bebida bebida2 = new Bebida("Coca-Cola", 18, 1.5);
		Shampoo shampoo1 = new Shampoo("Shampoo Sedal", 19, 500);
		Fruta frutilla1 = new Fruta("Frutillas", 64, "kilo");

		lista.add(bebida1);
		lista.add(bebida2);
		lista.add(shampoo1);
		lista.add(frutilla1);
	}

	public void mostrarListaDeProductosPorConsola() {
		Producto mayor = lista.get(0);
		Producto menor = lista.get(0);

		for (Producto p : lista) {
			System.out.println(p.toString());

			// Busca el menor y el mayor
			if (p.compareTo(menor) < 0) {
				menor = p;
			} else if (p.compareTo(mayor) > 0) {
				mayor = p;
			}
		}

		System.out.println("=============================");
		System.out.println("Producto más caro: " + mayor.getNombre());
		System.out.println("Producto más barato: " + menor.getNombre());
	}

}
