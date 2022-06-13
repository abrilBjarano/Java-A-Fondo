import java.util.Scanner;

public class conditional_statements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // -- SIMPLE --

        System.out.println("\n----------------------------\n");
        System.out.print("Digite su edad: ");
        int edad = scanner.nextInt();

        String respuesta_edad;

        if (edad > 17) {
            
            respuesta_edad = "\nUsted es mayor de edad.";
        } else {

            respuesta_edad = "\nUsted es menor de edad.";
        } // if end

        System.out.println(respuesta_edad);
        System.out.println("\n----------------------------\n");


        // -- MULTIPLE --

        System.out.println("\n---------------------------------\n");
        System.out.print("Digite un numero del 1 al 3: ");
        int num = scanner.nextInt();

        String respuesta_dia;

        switch (num) {

            case 1:
                respuesta_dia = "\nLunes.";
                break;

            case 2:
                respuesta_dia = "\nMartes.";
                break;

            case 3:
                respuesta_dia = "\nMiercoles.";
                break;

            default:
                respuesta_dia = "\nDigite un numero valido";
        } // switch end

        System.out.println(respuesta_dia);
        System.out.println("\n---------------------------------\n");

        // -- IN-LINE --

        System.out.println("\n---------------------------\n");
        System.out.print("Digite un numero: ");
        int numero = scanner.nextInt();

        int resta = numero % 2;

        String respuesta_numero = (resta == 0) ? "\nEs par." : "\nEs impar.";

        System.out.println(respuesta_numero);
        System.out.println("\n---------------------------\n");
    }
}