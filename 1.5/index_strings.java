public class index_strings {
    public static void main(String[] args){
        
        String s = "Hola te kiero mucho";

        int pos1 = s.indexOf('a');
        int pos2 = s.lastIndexOf('e');
        int pos3 = s.indexOf('x');

        System.out.println("\n----------\n");

        for(int i=0; i<s.length(); i++){

            System.out.println(i + " -> " + s.charAt(i));
        }

        System.out.println("\n" + pos1);
        System.out.println("\n" + pos2);
        System.out.println("\n" + pos3); // when the character doesn't exist within the string, the program returns -1

        System.out.println("\n----------\n");

        String s2 = "Me ire a caminar al rato a fundi porque amo fundi"; 

        int sub1 = s2.indexOf("caminar"); // also works for entire args
        int sub2 = s2.lastIndexOf("fundi");

        for(int j=0; j<s2.length(); j++){

            System.out.println(j + " -> " + s2.charAt(j));
        }

        System.out.println("\n" + sub1);
        System.out.println("\n" + sub2);
    }
}