package main;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.Almacen;
import model.Bebida;
import model.Producto;
import model.TipoUnidadVenta;
import model.Verduleria;

public class main {

    public static void main(String[] args) {
	List<Producto> productos= getInstancia();
	productos.forEach(System.out::println);
	System.out.println("=============================");
	System.out.println("Producto más caro: " + Collections.max(productos).getNombre());
	System.out.println("Producto más barato: " + Collections.min(productos).getNombre());
    }

    private static List<Producto> getInstancia() {
	List<Producto> productos= new ArrayList<>();
	productos.add(new Bebida("Coca-Cola Zero", BigDecimal.valueOf(20), 1.5));
	productos.add(new Bebida("Coca-Cola", BigDecimal.valueOf(18), 1.5));
	productos.add(new Almacen("Shampoo Sedal",BigDecimal.valueOf(19), "500ml"));
	productos.add(new Verduleria("Frutillas", BigDecimal.valueOf(64), TipoUnidadVenta.KILO));
	return productos;
    }

}
