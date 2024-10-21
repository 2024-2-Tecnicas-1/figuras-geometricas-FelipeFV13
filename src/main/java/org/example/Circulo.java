package org.example;

public class Circulo extends FiguraGeometrica{

    private double radio;

    public Circulo(String nombre, String color, double radio){
        super(nombre, color);
        this.radio = radio;
    }

    public double getRadio(){
        return this.radio;
    }

    public void setRadio(double radio){
        this.radio = radio;
    }

    @Override
    public double obtenerArea() {
        return Math.PI * Math.pow(getRadio(),2);
    }

    @Override
    public double obtenerPerimetro() {
        return 2 * Math.PI * getRadio() ;

    }


}
