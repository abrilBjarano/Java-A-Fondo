public class up_low_case {
    public static void main(String[] args){

        String cadena = "El Tiempo No Se Detendra";

        System.out.println("\nNomal: " + cadena);
        System.out.println("Mayusculas: " + cadena.toUpperCase());
        System.out.println("Minusculas: " + cadena.toLowerCase());

        String cadena2 = "Entiendo en mi caminar";

        String cad2up = cadena2.toLowerCase();

        System.out.println("\nTambien se puede guardar ese up/low-er case en una variable: \n" + cad2up);
    }
}