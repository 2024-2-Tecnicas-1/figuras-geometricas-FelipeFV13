package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nombreFigura = "";
        String colorFigura = "";
        int figuraUsuario;


        System.out.println("Bienvenido Usuario.");
        System.out.print("Ingrese el nombre de la figura: ");
        nombreFigura = input.nextLine();

        System.out.print("Ingrese el color de la figura: ");
        colorFigura = input.nextLine();

        System.out.print("Que figura desea imprimir\n" +
                "Ingrese\n1 para Circulo\n2 para Rectangulo\n3 para Triangulo\n" +
                "Ingrese el tipo de figura: ");
        figuraUsuario = input.nextInt();

        switch (figuraUsuario){

            case 1:
                double radio;

                System.out.print("Ingrese el valor del radio: ");
                radio = input.nextDouble();

                Circulo circulo1 = new Circulo(nombreFigura, colorFigura, radio);
                System.out.println(circulo1.mensaje("Circulo"));


                break;
            case 2:
                double lado1, lado2;

                System.out.print("Ingres el valor del lado 1 del triangulo: ");
                lado1 = input.nextDouble();

                System.out.print("OIngrese el valor del lado 2 del tringulo: ");
                lado2 = input.nextDouble();

                Rectangulo rectangulo1 = new Rectangulo(nombreFigura, colorFigura, lado1, lado2);

                System.out.println(rectangulo1.mensaje("Rectángulo"));

                break;
            case 3:
                double base, altura;

                System.out.print("ingrese la base del tringulo: ");
                base = input.nextDouble();

                System.out.print("Ingrse la altura del triangulo: ");
                altura = input.nextDouble();

                Triangulo trinagulo1 = new Triangulo(nombreFigura, colorFigura, base, altura);
                System.out.println(trinagulo1.mensaje("Triangulo"));

                break;
            default:
                System.out.println("Lo siento esa opcion es incorrecta. ");


        }

    }
}