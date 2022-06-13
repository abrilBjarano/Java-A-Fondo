import java.util.Scanner;

public class bases_num {
    public static void main(String[] args){

        int hex = 0xF12A4; // to add a hex value to a variable, we need to add 0x before the value
        System.out.println("\n" + hex);

        int oct = 07743;
        System.out.println(oct); // and a 0 before the value in case of a octal value

        int bin = 0b11111;
        System.out.println(bin); // 0b or 0B when is a binary value

        Scanner scan = new Scanner(System.in);

        System.out.print("\nIngrese un valor numerico: ");
        int val = scan.nextInt();

        System.out.println("\nValor ingresado: " + val 
                            + "\nbinario: " + Integer.toBinaryString(val)
                            + "\noctal: " + Integer.toOctalString(val)
                            + "\nhexadecimal: " + Integer.toHexString(val));

        System.out.print("Ingrese una base numerica: ");
        int base = scan.nextInt();

        System.out.println("\nValor " + val + " en base " + base + ": " + Integer.toString(val,base));
        // Integer.toString(value,base) when isn't the typical base

    }
}