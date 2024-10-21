package org.example;

public abstract class FiguraGeometrica {

    private String nombre;
    private String color;

    public FiguraGeometrica(String nombre, String color){

        this.nombre = nombre;
        this.color = color;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public abstract double obtenerArea();

    public abstract double obtenerPerimetro();

    public String  mensaje(String figura){

        return getNombre()+ " es un "+ figura + " de color "+ getColor()+", su area es "+ obtenerArea() + " y su perimetro es "+ obtenerPerimetro();

    }

}
