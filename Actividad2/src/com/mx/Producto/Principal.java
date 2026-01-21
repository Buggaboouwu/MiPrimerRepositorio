package com.mx.Producto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
	
	public static void main(String args[] ) {
		//instancia el objeto
		Producto prod1 = new Producto("Muñeca", "Muñeca Jade Pixies", "MGA", 1000, 5, "BR01");
		Producto prod2 = new Producto("Peluche", "Peluche Capibara", "X", 100, 800, "CA01");
		Producto prod3 = new Producto("Figura", "Figura Spiderman", "Mattel", 1500, 45, "FS01");
		Producto prod4 = new Producto("Muñeca", "Muñeca Bratz", "MGA", 800, 30, "BR04");
		Producto prod5 = new Producto("Carrito", "Carro en bloques", "Lego", 1299, 60, "LE01");
		
		//objeto auxiliar
		Producto prodAux = null;
		
		//Instanciar la clase de implementacion para poder ocupar todos los metodos declarados 
		Implementacion imp = new Implementacion();
		
		
		//almacenar todos los objetos en la lista 
		imp.create(0, prod1);
		imp.create(1, prod2);
		imp.create(2, prod3);
		imp.create(3, prod4);
		imp.create(4, prod5);
		
		//DECLARACIÓN DE VARIABLES LOCALES 
		Scanner scan = new Scanner(System.in); 
		//Lee lo que nos da el usuario 
		int menuP = 0, menuE = 0, indice = 0;
		
		String nombre, descripcion, marca, codigo;
		double precio;
		int stock;
		
		do {
			System.out.println("\n***** M E N U *****");
			System.out.println("1.- CREATE");
			System.out.println("2.- READ");
			System.out.println("3.- UPDATE");
			System.out.println("4.- DELETE");
			System.out.println("5.- SEARCH");
			System.out.println("6.- COUNT");
			System.out.println("7.- EXIT");
			System.out.println("ELIGE UNA OPCIÓN");
			//DECLARACIÓN DE BLOQUE TRY CATCH 
			try {
				menuP = scan.nextInt();
				scan.nextLine();
				
				//inicia bloque switch
				switch(menuP){
				case 1:
					System.out.println("\n<<<<<C R E A T E >>>>>");
					System.out.println("Ingresa los siguientes datos para registrar el producto\n");
					
					System.out.print("Nombre: ");
					nombre = scan.nextLine();
					
					System.out.print("Descripción: ");
					descripcion = scan.nextLine();
					
					System.out.print("Marca: ");
					marca = scan.nextLine();
					
					System.out.print("Código: ");
					codigo = scan.nextLine();
					
					System.out.print("Precio: ");
					precio = scan.nextDouble();
					scan.nextLine();
					
					System.out.print("Stock: ");
					stock = scan.nextInt();
					scan.nextLine();
					
					//Validar que no exista duplicado por código
					boolean existe = false;
					for(int i = 0; i < imp.lista.size(); i++) {
						if(imp.lista.get(i).getCodigo().equals(codigo)) {
							existe = true;
							break;
						}
					}
					
					if(existe) {
						System.out.println("Ya existe}");
					} else {
						//instanciar con valores recibidos 
						prodAux = new Producto(nombre, descripcion, marca, precio, stock, codigo);
						//guardar
						imp.create(indice, prodAux);
						indice++;
						System.out.println("Producto registrado");
					}
					break;
					
				case 2:
					System.out.println("\n<<<<< R E A D >>>>>");
					if(imp.lista.size() > 0) {
						imp.read();
					} else {
						System.out.println("lista está vacia");
					}
					break;
					
				case 3:
					System.out.println("\n<<<<< U P D A T E >>>>>");
					imprimirDatos(imp);
					if(imp.lista.size() > 0) {
						System.out.print("Indique el índice que desea editar: ");
						int indiceEditar = scan.nextInt();
						scan.nextLine();
						
						if(indiceEditar >= 0 && indiceEditar < imp.lista.size()) {
							prodAux = imp.buscar(indiceEditar);
							
							do {
								System.out.println("M E N Ú  E D I T A R ");
								System.out.println("1.- Nombre ");
								System.out.println("2.- Descripción ");
								System.out.println("3.- Marca ");
								System.out.println("4.- Código ");
								System.out.println("5.- Precio ");
								System.out.println("6.- Stock ");
								System.out.println("7.- Salir ");
								System.out.print("ELIGE UNA OPCIÓN: ");
								menuE = scan.nextInt();
								scan.nextLine();
								
								
								switch(menuE) {
								case 1:
									System.out.print("Ingresa el nuevo nombre: ");
									nombre = scan.nextLine();
									prodAux.setNombre(nombre);
									System.out.println(" actualizado");
									break;
								case 2:
									System.out.print("Ingresa la nueva descripción: ");
									descripcion = scan.nextLine();
									prodAux.setCategoria(descripcion);
									System.out.println(" actualizada");
									break;
								case 3:
									System.out.print("Ingresa la nueva marca: ");
									marca = scan.nextLine();
									prodAux.setMarca(marca);
									System.out.println("actualizada");
									break;
								case 4:
									System.out.print("Ingresa el nuevo código: ");
									String codigoNuevo = scan.nextLine();
									
									//Validar que no exista
									boolean codigoExiste = false;
									for(int i = 0; i < imp.lista.size(); i++) {
										if(i != indiceEditar && imp.lista.get(i).getCodigo().equals(codigoNuevo)) {
											codigoExiste = true;
											break;
										}
									}
									
									if(codigoExiste) {
										System.out.println("Ya existe un producto con ese código");
									} else {
										prodAux.setCodigo(codigoNuevo);
										System.out.println(" actualizado");
									}
									break;	
								case 5:
									System.out.print("Ingresa el nuevo precio: ");
									precio = scan.nextDouble();
									scan.nextLine();
									prodAux.setPrecio(precio);
									System.out.println("actualizado");
									break;
								case 6:
									System.out.print("Ingresa el nuevo stock: ");
									stock = scan.nextInt();
									scan.nextLine();
									prodAux.setStock(stock);
									System.out.println("actualizado");
									break;	
								case 7:
									System.out.println("Hasta luego");
									break;	
									default: 
										System.out.println("Fuera de rango,");
										break;
							
								}
							} while(menuE != 7);
							
							imp.update(indiceEditar, prodAux);
							System.out.println("Producto actualizado ");
							
						} else {
							System.out.println("No exite");
						}
						
					} else {
						System.out.println("lista vacía");
					}
					break;
					
				case 4: 
					System.out.println("\n<<<<< D E L E T E >>>>>");
					imprimirDatos(imp);
					if(imp.lista.size() > 0) {
						System.out.print("Indique el índice que desea eliminar: ");
						int indiceEliminar = scan.nextInt();
						scan.nextLine();
						//checa sino esta
						if(indiceEliminar >= 0 && indiceEliminar < imp.lista.size()) {
							System.out.println("Producto a eliminar: " + imp.lista.get(indiceEliminar).getNombre());
							imp.delete(indiceEliminar);
							indice--;
							System.out.println("Producto eliminado");
						} else {
							System.out.println("No existe orueba con otro");
						}
					} else {
						System.out.println("lista vacía");
					}
					break;
					
				case 5:
					System.out.println("\n<<<<< S E A R C H >>>>>");
					if(imp.lista.size() > 0) {
						System.out.println("Buscar por:");
						System.out.println("1.- Índice");
						System.out.println("2.- Nombre");
						System.out.println("3.- Código");
						System.out.print("Elige una opción: ");
						int opcionBuscar = scan.nextInt();
						scan.nextLine();
						
						boolean encontrado = false;
						
						switch(opcionBuscar) {
						case 1:
							imprimirDatos(imp);
							System.out.print("Indique el índice que busca: ");
							int indiceBuscar = scan.nextInt();
							scan.nextLine();
							
							if(indiceBuscar >= 0 && indiceBuscar < imp.lista.size()) {
								prodAux = imp.buscar(indiceBuscar);
								System.out.println("Producto:");
								System.out.println(prodAux);
								encontrado = true;
							}
							break;
							
						case 2:
							System.out.print("Ingresa el nombre del producto: ");
							String nombreBuscar = scan.nextLine();
							
							System.out.println("Resultados:");
							for(int i = 0; i < imp.lista.size(); i++) {
								if(imp.lista.get(i).getNombre().toLowerCase().contains(nombreBuscar.toLowerCase())) {
									System.out.println("Índice [" + i + "]: " + imp.lista.get(i));
									encontrado = true;
								}
							}
							break;
							
						case 3:
							System.out.print("Ingresa el código del producto: ");
							String codigoBuscar = scan.nextLine();
							
							for(int i = 0; i < imp.lista.size(); i++) {
								if(imp.lista.get(i).getCodigo().equals(codigoBuscar)) {
									System.out.println("Producto:");
									System.out.println(imp.lista.get(i));
									encontrado = true;
									break;
								}
							}
							break;
							
						default:
							System.out.println("Opción no válida");
							break;
						}
						
						if(!encontrado && opcionBuscar >= 1 && opcionBuscar <= 3) {
							System.out.println("No se encontró ");
						}
						
					} else {
						System.out.println("Lista vacia");
					}
					break;
					
				case 6:
					imp.contar();
					break;
					
				case 7: 
					System.out.println("Hasta luego!");
					break;
					
				default:
					System.out.println("intenta con un número del menú");
					break;
				}
				
			} catch(InputMismatchException e) {
				System.out.println("ingresa un valor numérico");
				scan.nextLine();
				
			} catch (Exception e) {
				System.out.println("error: " + e.getMessage());
				scan.nextLine();
			}
				
		} while(menuP != 7);
		
		scan.close();
	}
	//cierra el método main
	
	//es un método (miembro estático asociado a la clase) y este nos permite poder usarlo en cualquier parte 
	//siempre y cuando esté dentro de la clase 
	private static void imprimirDatos(Implementacion imp) {
		System.out.println("\nProductos registrados:");
		if(imp.lista.size() > 0) {
			for(int i = 0; i < imp.lista.size(); i++) {
				System.out.println("Producto[" + i + "] - " + imp.lista.get(i).getNombre() + 
								   " (Código: " + imp.lista.get(i).getCodigo() + ")");
			}
		} else {
			System.out.println("✗ No hay productos registrados");
		}
	}
}