import java.util.Scanner;

public class MayorOMenorEdad {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in); // el new va después del nombre de la clase

            System.out.print("Digita tu edad: ");
            int edad = scanner.nextInt();

            String msg = (edad > 17) ? "Eres mayor de edad" : "Eres menor de edad";

            System.out.println(msg);

        }
    }