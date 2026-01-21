package com.mx.Veterinaria;


public class Principal {



	public static void main(String[] args) {
		// Instanciar libro
		
		Veterinaria l1 = new Veterinaria(789456789, "Persa", "Chunchunmaru", "Verde", 4);
		Veterinaria l2 = new Veterinaria(123456789, "Cartujo", "Catsito", "Verde", 1);
		Veterinaria l3 = new Veterinaria(525444434, "Siames" , "Dewey" ,"Gris" , 2);
		Veterinaria l4 = new Veterinaria(879548782, "Calicó", "Pecas", "Negro",2);
		Veterinaria l5 = new Veterinaria(852234232, "Persa", "Lisa", "Amarillo", 6);
		Veterinaria l6 = new Veterinaria(838932120, "Europeo", "Valentino", "Negro", 3);
		Veterinaria l7 = new Veterinaria(125478896, "Bombay" , "Baticat" ,"Negro" , 4);
	
	
		Veterinaria auxLibro = null;
		ImpVeterinaria imp = new ImpVeterinaria();
		//guardar elementos en el hash
		imp.create(l1);
		imp.create(l2);
		imp.create(l3);
		imp.create(l4);
		imp.create(l5);
		imp.create(l6);
		imp.create(l7);
		
		//imprime lo que existe en el hash
		imp.read();
	
		//buscar
		auxLibro = new Veterinaria(123456789);
		auxLibro = imp.search(auxLibro);
		System.out.println("Libro enontrado " + auxLibro);
		
		//editar
		auxLibro = new Veterinaria(125478896);
		auxLibro = imp.search(auxLibro);
		auxLibro.setNombre("Gato");
		imp.update(auxLibro);
		System.out.println("Nombre actualizadp" + auxLibro);
		
		//eliminar
		auxLibro = new Veterinaria(838932120);
		imp.delete(auxLibro);
		System.out.println("Lista actualizada" + auxLibro);
		imp.read();
		
		//contar
		imp.contar();
		
		
	}

}
