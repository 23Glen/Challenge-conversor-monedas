import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();

        int opcion = 0;
        while (opcion != 8){

        System.out.println("""
                ¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤\s
                  ¡Bienvenidos al conversor de monedas!
                
                Ingresa la conversion que deseas realizar:
                
                1.) Dollar » peso Argentino
                2.) Peso Argentino » Dollar
                3.) Dollar » Real Brasileño\s
                4.) Real Brasileño » Dollar
                5.) Dollar » Peso Colombiano
                6.) Peso Colombiano » Dollar
                7.) Convertir » otra moneda
                8.) Salir
                ¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤""");
        opcion = lectura.nextInt();
        lectura.nextLine();

        switch (opcion){
            case 1:
                ConvertirMoneda.convertir("USD", "ARS", consulta, lectura);
                break;
            case 2:
                ConvertirMoneda.convertir("ARS", "USD", consulta,lectura);
                break;
            case 3:
                ConvertirMoneda.convertir("USD", "BRL", consulta,lectura);
                break;
            case 4:
                ConvertirMoneda.convertir("BRL", "USD", consulta,lectura);
                break;
            case 5:
                ConvertirMoneda.convertir("USD", "COP", consulta,lectura);
                break;
            case 6:
                ConvertirMoneda.convertir("COP", "USD", consulta,lectura);
                break;
            case 7:
                ConvertirMoneda.convertirOtraMonaeda(consulta, lectura);
                break;
            case 8:
                System.out.println("Saliendo del conversor!");
                break;

            default:
                System.out.println("Opción no válida.");
                break;
           }
        }
    }
}
