import java.util.Scanner;

public class dimensional_arr {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);


        /* -- INT ARRAY -- */

        int arr[] = new int [10]; // 10 array lenght

        System.out.println("\n------------------\n");
        System.out.print("Digite un valor: ");
        int v = scanner.nextInt();

        int i=0;

        while(i<10){

            arr[i++] = v; // v = i, then i increase

            System.out.print("Digite el siguiente valor: ");
            v = scanner.nextInt(); // @ why is still counting till 11?
        }

        for(int j=0;j<i;j++){

            System.out.println(arr[j]);
        }


        /* -- STRING ARRAY -- */

        String dias[] = { "Lunes", "Martes", "Miercoles" };

        System.out.print("Ingrese un dia de la semana: ");
        int dia = scanner.nextInt();

        if(dia <= dias.length){

            System.out.println(dias[dia-1]); // minus 1 bc arrays start from 0
        } else {

            System.out.println("Dia incorrecto... ");
        }

        System.out.println("El numero de dias es: " + dias.length);

    } // end main
} // end class dimensional_arr