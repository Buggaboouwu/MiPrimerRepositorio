package com.mx.Producto;

public class Producto {

	private String nombre;
	private String descripcion;
	private String marca;
	private double precio;
	private int stock;
	private String codigo;

	public Producto() {

	}

	public Producto(String nombre, String descripcion, String marca, double precio, int stock, String codigo) {
		this.nombre = nombre;
		this.descripcion= descripcion;
		this.marca = marca;
		this.precio = precio;
		this.stock = stock;
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setCategoria(String descripcion) {
		this.descripcion= descripcion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", descipcion=" + descripcion+ ", marca=" + marca + ", precio="
				+ precio + ", stock=" + stock + ", codigo=" + codigo + "]\n";
	}

}