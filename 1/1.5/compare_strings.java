import java.util.Scanner;

public class compare_strings {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese una cadena: ");
        String s1 = scan.next();
        System.out.print("Ingrese otra cadena: ");
        String s2 = scan.next();

        // the program takes a space as another string
        // if the input is: hola como
        // the program takes hola as s1, and como as s2

        System.out.println("\ns1 = [" + s1 + "]");
        System.out.println("s2 = [" + s2 + "]");

        if(s1.equals(s2)){ // if we use ==, the program will compare the memory directions of each string instead of its content
            System.out.println("\nSon iguales. ");
        } else {
            System.out.println("\nNo son iguales. ");
        }

    }
}