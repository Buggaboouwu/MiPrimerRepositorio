package com.automovil;

public class automovil {
    private String marca;
    private String subMarca;
    private int precio;
    private String color;

    // Declaración de los constructores: inicializan la clase

    // Constructor por defecto
    public automovil() {
        
    }

    // Constructor con parámetros o constructor parametrizado
    // Inicializa la clase con sus atributos
    public automovil(String marca, String subMarca, int precio, String color) {
        this.marca = marca;
        this.subMarca = subMarca;
        this.precio = precio;
        this.color = color;
    }

    // Getters y Setters: nos permiten acceder de forma controlada a los atributos
    // get sirve para obtener el valor del atributo
    
    public String getMarca() {
        return marca;
    }

    // set sirve para fijar o cambiar el valor del atributo
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSubMarca() {
        return subMarca;
    }

    public void setSubMarca(String subMarca) {
        this.subMarca = subMarca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    // Método toString: convertir las cadenas en legibles para que se puedan interpretar
    @Override
    public String toString() {
        return "Automovil=[marca=" + marca + ", subMarca=" + subMarca + ", precio=" + precio 
               + ", Color=" + color + "]\n";
    }
}