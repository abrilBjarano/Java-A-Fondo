import java.util.Scanner;

public class string_buffer {
    public static void main(String[] args){

        // Scanner scan = new Scanner(System.in);

        // System.out.print("Ingresa tu nombre y apellido: ");
        // String name = scan.next();
        // String surname = scan.next();

        // StringBuffer sb = new StringBuffer("Hola ");
        
        // sb.append("mi nombre es ");
        // sb.append(name + surname);

        // System.out.println(sb);

        Scanner scan = new Scanner(System.in);

        StringBuffer full_name = new StringBuffer();

        System.out.print("Ingrese su nombre completo: ");
        full_name.append(scan.nextLine()); // to return a string with a variety of arguments

        StringBuffer welcome = new StringBuffer("Hola, bienvenid@: ").append(full_name);

        System.out.println(welcome);
    }
}