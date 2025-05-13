import java.util.Scanner;

public class ConvertirMoneda {

    public static void convertir (String monedaBase, String monedaObjetivo, ConsultaMoneda consulta, Scanner lectura){
        double cantidad;
        double cantidadConvertida;

        Moneda moneda = consulta.buscaMoneda(monedaBase, monedaObjetivo);
        System.out.println("La tasa de conversión para hoy es: \n1 "+monedaBase+" = "+moneda.conversion_rate()+" "+monedaObjetivo);
        System.out.println("Ingrese la cantidad de " + monedaBase +" que desea convertir: ");
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * moneda.conversion_rate();
        System.out.println(cantidad+" "+monedaBase+" = "+cantidadConvertida+" "+moneda.target_code());
    }
    public static void convertirOtraMonaeda(ConsultaMoneda consulta, Scanner lectura){
        System.out.println("Convertir de: ");
        String monedaBase = lectura.nextLine().toUpperCase();
        System.out.println("a: ");
        String monedaObjetivo = lectura.nextLine().toUpperCase();
        convertir(monedaBase, monedaObjetivo, consulta, lectura);
    }
}
