package Programas;

import java.util.Scanner;

public class Ejercicio1 {
    import java.util.Scanner;

    public class TiendaMrNuez {
        static Scanner sc =new Scanner(System.in):
        static int stockMinimoProd = 20;
        static int stockMinimoEmpaques = 20;
        static int numVentasDiaria = 0;
        static int totalProductosVendidos = 0;
        static double montoTotalVentas;
        static String arrayNombreProductos[] = {"Almendra Chica", "Almendra Grande", "CashewChico", "CashewGrande", "Castaña Chica", "Castaña Grande", "Pecana Chica", "Pecana Grande"};
        static int arrayCodigoProductos[] = {101, 102, 201, 202, 301, 301, 401, 402};
        static float arrayPrecios[] = {12, 20, 16, 25, 12, 20, 15, 24};
        static int arrayStockProductos[] = {100, 50, 100, 50, 100, 50, 100, 50};
        static int arrayStockEmpaques[] = {1000, 1000, 1000, 1000, 1000, 1000, 1000};
        static int arrayCantidadProdVendidosDia[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        static double arrayMontoVentasDia[] = {0, 0, 0, 0, 0, 0, 0, 0,};
        static int longitudArray = arrayCodigoProductos.length;

        private static void main() {
            tomaPedido();
            lanzaAlertas();
            balanceDiario();
        }

        private static void tomaPedido() {
            float montoFinal = 0;
            ventaPorCliente();
            cobra(montoFinal);
            if (montoFinal > 0) {
                numVentasDiaria = numVentasDiaria ++1;
                generarBoleta()// no se implementará
            }
        }

        private static void ventaPorCliente(){
            boolean siguePedido= true;

            while (siguePedido){
                int codProducto=0;
                System.out.println("Ingrese el código del producto vendido: ");
                codProducto= sc.nextInt();
                totalProductosVendidos= totalProductosVendidos + cantidad;
                incrementaCantProdVendidosAlDia(codProducto,cantidad);
                incrementaMontoVentaDiariaPorProd(codProducto,cantidad);
                descuentaStockProd(codProducto,cantidad);
                descuentaStockEmpaques(codProducto,cantidad);
                montoFinal=montoFinal+calculaMonto(codProducto,cantidad);
                System.out.println("¿El cliente sigue pidiendo? true sie s verdad, false si no lo es ");
                siguePedido= sc.hasNextBoolean();
            }
        }
        private static void cobra(double importe) {
            double vuelto = 0;
            double conCuantoPaga=0;
            System.out.println("Ingrese cantidad de dinero con la que el cliente paga: ");
            conCuantoPaga= sc.nextDouble();
            vuelto = conCuantoPaga –importe;
            System.out.println("Entregar  " + vuelto + "soles de vuelto");
        }


        private static void incrementaCantProdVendidosAlDia (int codProd, int cant){
            for(int i=0 ; i<=longitudArray; i++){
                if (arrayCodigoProductos[i] == codProd){
                    arrayCantidadProdVendidosDia[i] = arrayCantidadProdVendidosDia[i] + cant;
                }
            }
        }

        private static incrementaMontoVentaDiariaPorProd (int codProd, int cant) {
            for( int i = 0;i <= longitudArray;i++){
                if (arrayCodigoProductos[i] == codProd) {
                    arrayMontoVentasDia[i] = arrayMontoVentasDia[i] + calculaMonto(codProd, cant);
                    montoTotalVentas = montoTotalVentas + arrayMontoVentasDia[i];
                }
            }
        }

        private static descuentaStockProd(int codProd, int cant) {
            for (int i = 0; i <= longitudArray; i++) {
                if (arrayCodigoProductos[i] == codProd) {
                    arrayStockProductos[i] = arrayStockProductos[i] –cant;
                }
            }
        }

        private static descuentaStockEmpaques(int codProd, int cant){
            for(int i=0 ; i<=longitudArray; i++){
                if (arrayCodigoProductos[i]==codProd){
                    arrayStockEmpaques[i]= arrayStockEmpaques[i] – cant;
                }
            }
        }

        private static double calculaMonto(int codProd, int cant) {
            double monto = 0
            for (int i = 0; i <= longitudArray; i++) {
                if (arrayCodigoProductos[i] == codProd) {
                    monto = arrayPrecios[i]*cant;
                }
            }
            return monto;
        }

        private static void lanzaAlertas (){
            for(int i=0 ; i<=longitudArray; i++){
                if (arrayStockProductos[i] < stockMinimoProd)
                    System.out.println("STOCK DE " + arrayNombreProductos[i]+"ES INSUFICIENTE. ENVASAR URGENTE");
            }

            for(int i=0 ; i<=longitudArray; i++){
                if (arrayStockEmpaques[i] < stockMinimoEmpaques)
                    System.out.println("STOCK DE EMPAQUES INSUFICIENTE. REALIZAR PEDIDO URGENTE");
            }
        }

        private static void balanceDiario (){
            System.out.println("BALANCE");
            System.out.println("CANTIDAD DE PRODUCTOS VENDIDOS POR PRESENTACIÓN: " + arrayCantidadProdVendidosDia)
            System.out.println("CANTIDAD DE PRODUCTOS VENDIDOS POR TIPO: ");
            System.out.println("Almendras" + arrayCantidadProdVendidosDia[0]+ arrayCantidadProdVendidosDia[1]);
            System.out.println("Cashews" + arrayCantidadProdVendidosDia[2]+ arrayCantidadProdVendidosDia[3]);
            System.out.println("Castañas" + arrayCantidadProdVendidosDia[4]+ arrayCantidadProdVendidosDia[5]);
            System.out.println("Pecanas" + arrayCantidadProdVendidosDia[6]+ arrayCantidadProdVendidosDia[7]);
            System.out.println("TOTAL DE PRODUCTOS VENDIDOS : "  + totalProductosVendidos);


            System.out.println("MONTO DE LAS VENTAS DE PRODUCTOS POR PRESENTACIÓN: ” + arraymontoVentasDia);
                    System.out.println("MONTO DE LAS VENTAS POR TIPO DE PRODUCTO: ");
            System.out.println("Almendras" + arrayMontoVentasDia[0]+ arrayMontoVentasDia[1]);
            System.out.println("Cashews" + arrayMontoVentasDia[2]+ arrayMontoVentasDia[3]);


            System.out.println("Castañas” arrayMontoVentasDia[4]+ arrayMontoVentasDia[5]);
                    System.out.println("Pecanas” arrayMontoVentasDia[6]+ arrayMontoVentasDia[7]);
                            System.out.println("EL MONTO TOTAL DE LAS VENTAS DE HOY ES ” + montoTotalVentas);

                                    System.out.println("CANTIDAD DE PRODUCTOS EN STOCK: ” + arrayStockProductos);
                                            System.out.println("CANTIDAD DE EMPAQUES EN STOCK: ” + arrayStockEmpaques);
    }
}
