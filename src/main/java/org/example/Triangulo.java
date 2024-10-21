package org.example;

public class Triangulo extends FiguraGeometrica{

    private double base;
    private double altura;

    public Triangulo(String nombre, String color, double base, double altura){
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }

    public double getBase(){
        return this.base;
    }

    public double getAltura(){
        return this.altura;
    }

    public void setBase(double base){
        this.base = base;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    @Override
    public double obtenerArea() {
        return (getBase()*getAltura())/20;
    }

    @Override
    public double obtenerPerimetro() {
        double hipotenusa = Math.sqrt(Math.pow(getAltura(),2)+Math.pow((getBase()/2),2));

        return (hipotenusa * 2)+getAltura()+getBase();
    }
}
