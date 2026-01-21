package com.mx.Veterinaria;

public class Veterinaria {
	
	private int isbn;//clave
	private String Raza;
	private String Nombre;
	private String Color;
	private double Edad;

	public Veterinaria(){
		
	}




	public Veterinaria(int isbn, String raza, String nombre, String color, double edad) {
		super();
		this.isbn = isbn;
		this.Raza = raza;
		this.Nombre = nombre;
		this.Color = color;
		this.Edad = edad;
	}

	public Veterinaria(int isbn) {
		this.isbn = isbn;
	}
	
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getRaza() {
		return Raza;
	}

	public void setRaza(String raza) {
		Raza = raza;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public double getEdad() {
		return Edad;
	}

	public void setEdad(double edad) {
		Edad = edad;
	}

	@Override
	public String toString() {
		return "Veterinaria [ID=" + isbn + ", Raza=" + Raza + ", Nombre=" + Nombre + ", Color=" + Color + ", Edad="
				+ Edad + "]";
	}



	
	
}
