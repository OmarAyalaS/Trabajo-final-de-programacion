package Programas;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        double descuento1 = 0;
        double descuento2 = 0;
        int cantidad,tipo;
        double decuentoTotal = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("TIPOS DE PRENDAS");
        System.out.println("(1) Pantalon");
        System.out.println("(2) Polo");
        System.out.println("(3) Casaca");

        System.out.println("Ingrese el tipo de prenda que desea comprar (opción 1   2 o 3)  ");
        tipo=sc.nextInt();

        if (tipo==1) {
            descuento1 = 0.08;
        }
        else if (tipo==2) {
            descuento1 = 0.05;
        }
        else if (tipo==3) {
            descuento1 = 0.07;
        }
        else {
            System.out.println("No ingreso el tipo de prenda correcta");
        }

        System.out.println("Ingrese la cantidad de prendas que va a comprar: ");
        cantidad = sc.nextInt();
        if (cantidad < 12) {
            descuento2 = 0;
        }
        else if (cantidad < 37) {
            descuento2 = 0.10;
        }
        else if (cantidad < 73) {

            descuento2 = 0.20;
        }
        else if (cantidad < 97) {
            descuento2 = 0.25;
        }
        else if (cantidad >= 97) {
            descuento2 = 0.30;
        }
        else{
            System.out.println("No ingresó la cantidad correcta");
        }

        decuentoTotal = (1-(1-descuento1)*(1-descuento2))*100;
        System.out.printf("El descuento total por su compra es: %.1f %s", decuentoTotal, "%" );

    }
}

