package model;

import java.math.BigDecimal;

public class Verduleria extends Producto {
    private TipoUnidadVenta unidadVenta;

    public Verduleria(String nombre, BigDecimal precio, TipoUnidadVenta unidadVenta) throws IllegalArgumentException {
	super(nombre, precio);
	this.unidadVenta = unidadVenta;
    }

    public TipoUnidadVenta getUnidadVenta() {
	return unidadVenta;
    }

    public void setUnidadVenta(TipoUnidadVenta unidadVenta) {
	this.unidadVenta = unidadVenta;
    }

    @Override
    public String toString() {
	return "Nombre: " + nombre + " /// Precio: $" + precio + " /// Unidad de venta: "
		+ unidadVenta;
    }

}
