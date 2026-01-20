package com.mx.Producto;
//para implementar una interfaz se ocupa la palabra reservada "implements"
import java.util.ArrayList;
import java.util.List;

public class Implementacion implements IMetodos{
	//declaracion de una lista para agregar un comportamiento a los metodos declarados
	List<Producto> lista = new ArrayList<Producto>();
	@Override //sobreEscritura de metodos, cambia el comportamiento inicial de un metodo 
	
	public void create(int indice, Producto producto) {
		lista.add(producto);
	}
	@Override
	public void read() {
		System.out.println(lista);
	}
	@Override
	public void update(int indice, Producto producto) {
		lista.set(indice, producto);
	}
	@Override
	public void delete(int indice) {
		lista.remove(indice);
	}
	@Override
	public Producto buscar(int indice) {
		
		return lista.get(indice);
	}
	
	//metodos personalizados 
	public void contar() {
		System.out.println("Existen " +  lista.size() + " Productos registrados");
	}
}