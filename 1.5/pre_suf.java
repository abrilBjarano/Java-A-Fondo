import java.util.Scanner;

public class pre_suf {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String s = "De que me sirve esto";

        boolean b1 = s.startsWith("De que");
        boolean b2 = s.startsWith("Que el paso tiempo");
        boolean b3 = s.endsWith("esto");
        boolean b4 = s.endsWith("Ahora ya lo entiendo");

        System.out.println("\n" + b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4 + "\n");
    }
}