package Entidades;

public class Perros {
	
	private String nombre; //Clave
	private String color;
	private int peso;
	private double patas;
	
	public Perros() {
		
		
		
	}

	public Perros(String nombre, String color, int peso, double patas) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.peso = peso;
		this.patas = patas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public double getPatas() {
		return patas;
	}

	public void setPatas(double patas) {
		this.patas = patas;
	}

	@Override
	public String toString() {
		return "Perros [nombre=" + nombre + ", color=" + color + ", peso=" + peso + ", patas=" + patas + "]";
	}
	
	
	

}
