package com.mx.Libro;

public class Principal {

	public static void main(String[] args) {
		// Instanciar libro
		
		Libro l1 = new Libro(789456789, "Java Básico", "Juan Pérez", "Alfa", 450);
		Libro l2 = new Libro(123456789, "Balada de pájaros", "Suzanne Collins", "Scholastic", 1000);
		Libro l3 = new Libro(525444434, "100 años de soledad" , "Juan de la Barrera" ,"Editorial Porrua" , 250);
		Libro l4 = new Libro(879548782, "Macbeth", "William Shakespeare", "Porrua",250);
		Libro l5 = new Libro(852234232, "Python para principiantes", "Flor hernandez", "Editorial Panamericana", 650);
		Libro l6 = new Libro(838932120, "Alas de sanngre", "Rebaca Yarros", "Editorial Planeta", 300);
		Libro l7 = new Libro(125478896, "El Principito" , "Antoine de Saint Exupery" ,"Editorial Porrua" , 400);
	
	
		Libro auxLibro = null;
		ImpLibro imp = new ImpLibro();
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
		auxLibro = new Libro(123456789);
		auxLibro = imp.search(auxLibro);
		System.out.println("Libro enontrado " + auxLibro);
		
		//editar
		auxLibro = new Libro(125478896);
		auxLibro = imp.search(auxLibro);
		auxLibro.setAutor("Rebeca Yarros");
		imp.update(auxLibro);
		System.out.println("Libro actualizado " + auxLibro);
		
		//eliminar
		auxLibro = new Libro(838932120);
		imp.delete(auxLibro);
		System.out.println("Lista actualizada" + auxLibro);
		imp.read();
		
		//contar
		imp.contar();
		
		
		//replicar el ejercicio usando entidad diferente 
		
	}
}
