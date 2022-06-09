import java.util.Scanner;

public class characters {
    public static void main(String[] args){

        for(int i=60; i<'A'; i++){ // '' is for char (integer numerical values)

            System.out.println(i);
        }

        System.out.println("\n-----------------\n");

        int j=0;

        do {

            System.out.println(j++ + "A"); // "" is for strings (which are objects and have methods)
        } while(j<5);


        System.out.println("\n-----------------\n");

        char c;
        int k='A';

        while(k<'F'){

            c = (char) k; // to cast int into char
            System.out.println(c);
            k++;
        }

    } // main end
} // characters class end