package com.mx.Libro;

import java.util.HashMap;

public class ImpLibro implements IMetodosLibro {
/*Declaración del HASHMAP
 * Sintaxis
 * HashMap <Clave, valor> hash = new HashMap<Clave, Valor>();
 * 
 * HashMap -> es una libreria de java.uutil
 * <> -> operador diamante 
 * Clave (eyDateType) -> Clase contenedora del primitivo de mi clase 
 * Valor(ValueDataType) -> Nombre de la clase 
 * Nombre (hash) -> definido por programador 
 * new -> palabra reservada para invocar al constructor y lo llama por defecto
 * 
 * 
 * */
	
	
	//declarar el hasmap para el objeto libro 
	
	HashMap<Integer, Libro> hash = new HashMap<Integer, Libro>();
	@Override
	public void create(Libro libro) {
		hash.put(libro.getIsbn(), libro);
		
		
	}

	@Override
	public void read() {
		System.out.println(hash);
		
	}

	@Override
	public void update(Libro libro) {
		//hash map no ofrece un metodo para editar, pero el put no 
		//permite valores duplicados, se utiliza porque cuando 
		//identifica una clave identica, reemplaza los valores
		//anteriores dejando la clave igual
		
		hash.put(libro.getIsbn(), libro);
		
		
	}

	@Override
	public void delete(Libro libro) {
		hash.remove(libro.getIsbn());
		
		
	}

	@Override
	public Libro search(Libro libro) {
		
		return hash.get(libro.getIsbn());
		
	} //palabra reservada con nombre de interfaz (se usan los metodos de la interfaz)
	//metodo personalizado 
		public void contar() {
			System.out.println("El hash contiene " + hash.size() + " libros registrados");
		}
}
