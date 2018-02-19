package model;

import java.math.BigDecimal;

public class Almacen extends Producto {
    private String contenido;

    public Almacen(String nombre, BigDecimal precio, String contenido) throws IllegalArgumentException {
	super(nombre, precio);
	setContenido(contenido);
    }

    public String getContenido() {
	return contenido;
    }

    public void setContenido(String contenido) throws IllegalArgumentException {
	nombre = nombre.trim();
	if (nombre.isEmpty())
	    throw new IllegalArgumentException("El contenido no puede estar vácio! contenido: \"" + contenido + "\"");
	this.contenido = contenido;
    }

    @Override
    public String toString() {
	return "Nombre: " + nombre + " /// Contenido: " + contenido + " /// Precio: $" + precio;
    }

}
