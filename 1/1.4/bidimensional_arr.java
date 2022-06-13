import java.util.Scanner;

public class bidimensional_arr {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de filas: ");
        int f = scanner.nextInt();
        System.out.print("Ingrese la cantidad de columnas: ");
        int c = scanner.nextInt();

        int bid_arr[][] = new int[f][c];

        int num;

        for(int i=0; i<f; i++){
            for(int j=0; j<c; j++){

                num = (int)(Math.random()*1000); // (int) to cast the result to int
                bid_arr[i][j] = num;
            }
        }

        
        for(int i=0; i<f; i++){
            for(int j=0; j<c; j++){

                System.out.print(bid_arr[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println("Numero de filas: " + bid_arr.length + "\n Numero de columnas: " + bid_arr[0].length); // [0] for columns

    } // main end
} // class end