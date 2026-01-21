package Entidades;

public class Gatos {

	private String nombre; 
	private String color;
	private int peso;
	private double precio;
	

	public Gatos() {
		
		
	}


	public Gatos(String nombre, String color, int peso, double precio) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.peso = peso;
		this.precio = precio;
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


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "Gatos [nombre=" + nombre + ", color=" + color + ", peso=" + peso + ", precio=" + precio + "]";
	}
	
	
}