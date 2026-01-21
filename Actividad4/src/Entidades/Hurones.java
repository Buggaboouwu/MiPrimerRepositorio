package Entidades;

public class Hurones {

	
	private String nombre; //Clave
	private String color;
	private int peso;
	private double Largo;
	
	public Hurones() {
		
		
		
	}

	public Hurones(String nombre, String color, int peso, double largo) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.peso = peso;
		Largo = largo;
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

	public double getLargo() {
		return Largo;
	}

	public void setLargo(double largo) {
		Largo = largo;
	}

	@Override
	public String toString() {
		return "Hurones [nombre=" + nombre + ", color=" + color + ", peso=" + peso + ", Largo=" + Largo + "]";
	}
	
	
}
