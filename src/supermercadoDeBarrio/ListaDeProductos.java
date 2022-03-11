package supermercadoDeBarrio;

import java.util.List;
import productos.*;
import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

//Se te ocurre un nombre mas descriptivo para la clase?
public class ListaDeProductos {
    //List
    private List<Producto> lista;

    //En que otro lugar podría estar la carga de los productos?
    public void cargarListaDeProductos() {
        Bebida bebida1 = new Bebida("Coca-Cola Zero", 20, 1.5);
        Bebida bebida2 = new Bebida("Coca-Cola", 18, 1.5);
        Shampoo shampoo1 = new Shampoo("Shampoo Sedal", 19, 500);
        Fruta frutilla1 = new Fruta("Frutillas", 64, "kilo");

        lista = asList(bebida1, bebida2, shampoo1, frutilla1);
    }

    public void mostrarListaDeProductosPorConsola() {
        lista.stream().forEachOrdered(this::mostrarProducto);
        List<Producto> productosOrdenados = lista.stream().sorted().collect(toList());
        System.out.println("Producto más barato: " + productosOrdenados.get(0));
        System.out.println("Producto más caro: " + productosOrdenados.get(productosOrdenados.size() - 1));
    }

    private void mostrarProducto(Producto producto) {
        System.out.println(producto);
    }

}
