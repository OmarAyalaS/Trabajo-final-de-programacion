package Programas;

public class Ejercicio1 {
    public static void main(String[] args) {
        //Datos de prueba
        double precio =  55.5;
        int talleres = 4;
        int referidos = 9;

        //Para probar método calcularDsctoxTaller
        double descuento1 = calcularDsctoxTaller(precio,talleres);
        System.out.printf("El primer descuento es: %.2f \n", descuento1);

        //Para probar método calcularDsctoxReferido
        double descuento2 = calcularDsctoxReferido(precio,referidos);
        System.out.printf("El segundo descuento es: %.2f \n", descuento2);

        //Para probar método calcularCostoxTalleres
        double precioFinal = calcularCostoxTalleres(precio,talleres,referidos);
        System.out.printf("El precio final (incluyendo descuentos) es: %.2f \n ", precioFinal);

    }

    static double calcularDsctoxTaller(double precio, int talleres){
        double descuento = 0.0;
        if (talleres >=2 && talleres <=4){
            descuento = 0.05 * precio;
        }else if(talleres >=5 && talleres <=7){
            descuento = 0.10 * precio;
        }else if(talleres >=8 && talleres <=10){
            descuento = 0.15 * precio;
        }
        return descuento;
    }

    static double calcularDsctoxReferido(double precio, int referidos){
        double descuento = 0.0;
        if (referidos >=2 && referidos <=5){
            descuento = 0.07 * precio;
        }else if(referidos >=6 && referidos <=8){
            descuento = 0.10 * precio;
        }else if(referidos ==9 || referidos ==10){
            descuento = 0.12 * precio;
            descuento = descuento + 20;
        }
        return descuento;
    }

    static double calcularCostoxTalleres(double precio, int talleres, int referidos){
        double descuento1 = calcularDsctoxTaller(precio,talleres);
        double descuento2 = calcularDsctoxReferido(precio,referidos);
        double precioFinal = precio - descuento1 - descuento2;
        return precioFinal;
    }
}


