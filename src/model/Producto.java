package model;

import java.math.BigDecimal;

public class Producto implements Comparable<Producto> {
    protected String nombre;
    protected BigDecimal precio;

    public Producto(String nombre, BigDecimal precio) throws IllegalArgumentException {
	setNombre(nombre);
	setPrecio(precio);
    }

    public String getNombre() {
	return nombre;
    }

    public void setNombre(String nombre) throws IllegalArgumentException {
	nombre = nombre.trim();
	if (nombre.isEmpty())
	    throw new IllegalArgumentException("El nombre no puede estar vácio! nombre: \"" + nombre + "\"");
	this.nombre = nombre;
    }

    public BigDecimal getPrecio() {
	return precio;
    }

    public void setPrecio(BigDecimal precio) throws IllegalArgumentException {
	if (precio.compareTo(BigDecimal.ZERO) <= 0)
	    throw new IllegalArgumentException("El precio del producto debe ser positivo! precio: " + precio);
	this.precio = precio;
    }

    @Override
    public int compareTo(Producto other) {
	return this.precio.compareTo(other.precio);
    }

}
