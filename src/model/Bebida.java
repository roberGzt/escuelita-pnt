package model;

import java.math.BigDecimal;

public class Bebida extends Producto {
    private double capacidad;

    public Bebida(String nombre, BigDecimal precio, double capacidad) throws IllegalArgumentException {
	super(nombre, precio);
	setCapacidad(capacidad);
    }

    public double getCapacidad() {
	return capacidad;
    }

    public void setCapacidad(double capacidad) throws IllegalArgumentException {
	if (capacidad <= 0)
	    throw new IllegalArgumentException("La capacidad de la bebida debe ser positiva! capacidad: " + capacidad);
	this.capacidad = capacidad;

    }

    @Override
    public String toString() {
	return "Nombre: " + nombre + " /// Litros: " + capacidad + " /// Precio: $" + precio;
    }

}
