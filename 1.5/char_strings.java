public class char_strings {
    public static void main(String[] args){

        String cadena = "Me despido de ti";

        System.out.println("\n" + cadena.charAt(0));
        System.out.println(cadena.charAt(5));

        System.out.println(cadena.charAt(cadena.length()-1) + "\n"); // "-1" bc the string sequence starts at 0 and the length sequence starts at 1.

        for(int i=0; i<cadena.length(); i++){

            System.out.println(i + "-> " + cadena.charAt(i));
        }
    }
}