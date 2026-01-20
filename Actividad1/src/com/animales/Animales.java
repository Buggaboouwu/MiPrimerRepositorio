package com.animales;

public class Animales {
    private String Especie ;
    private String Raza;
    private String Color;
    private int Años;
    
    public Animales() {
        
    }

    public Animales(String Especie, String Raza, String Color, int Años) {
        this.Especie = Especie;
        this.Raza = Raza;
        this.Color= Color;
        this.Años = Años;
    }
    
    
    public String getEspecie() {
        return Especie;
    }

    // set sirve para fijar o cambiar el valor del atributo
    public void setEspecie(String Especie) {
        this.Especie = Especie;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public int getAños() {
        return Años;
    }

    public void setAños(int Años) {
        this.Años = Años;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }
    
    // Método toString: convertir las cadenas en legibles para que se puedan interpretar
    @Override
    public String toString() {
        return "El animal es =[un =" + Especie + ", de raza =" + Raza + ", tiene un color=" + Color
               + ", y tiene =" + Años + "]\n";
    }
}