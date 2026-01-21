package com.mx.Veterinaria;

import java.util.HashMap;


public class ImpVeterinaria implements IMetodosVeterinaria{
	HashMap<Integer, Veterinaria> hash = new HashMap<Integer, Veterinaria>();
	@Override
	public void create(Veterinaria veterinaria) {
		hash.put(veterinaria.getIsbn(), veterinaria);
		
		
	}

	@Override
	public void read() {
		System.out.println(hash);
		
	}

	@Override
	public void update(Veterinaria veterinaria) {
		//hash map no ofrece un metodo para editar, pero el put no 
		//permite valores duplicados, se utiliza porque cuando 
		//identifica una clave identica, reemplaza los valores
		//anteriores dejando la clave igual
		
		hash.put(veterinaria.getIsbn(), veterinaria);
		
		
	}

	@Override
	public void delete(Veterinaria veterinaria) {
		hash.remove(veterinaria.getIsbn());
		
		
	}

	@Override
	public Veterinaria search(Veterinaria veterinaria) {
		
		return hash.get(veterinaria.getIsbn());
		
	} //palabra reservada con nombre de interfaz (se usan los metodos de la interfaz)
	//metodo personalizado 
		public void contar() {
			System.out.println("El hash contiene " + hash.size() + " animalitos registrados");
		}

}
