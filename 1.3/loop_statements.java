import java.util.Scanner;

public class loop_statements {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        // -- WHILE --

        System.out.println("\n----------------------\n");
        System.out.print("Digite un numero: (while) ");
        int numero1 = scanner.nextInt();

        int i = 1;

        while (i <= numero1) {

            System.out.println("\n " + i);
            i++;
        } // while end

        System.out.println("\n----------------------\n");

        
        //  -- DO-WHILE --

        System.out.print("Digite un numero: (do-while) ");
        int numero2 = scanner.nextInt();

        int j = numero2;

        do {

            System.out.println("\n " + j);
            j--;
        } while ( j > 0 );

        System.out.println("\n----------------------\n");


        // -- FOR --

        System.out.print("Digite un numero: (for) ");
        int numero3 = scanner.nextInt();

        for(int k=1; k<=numero3; k++) {

            System.out.print(k + ", ");
        } // for end

        
        System.out.println("\n----------------------\n");
    }
}