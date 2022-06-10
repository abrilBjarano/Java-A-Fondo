public class substrings {
    public static void main(String[] args){

        String s = "Mi saga favorita es la de Twilight";

        String s1 = s.substring(0,2);
        String s2 = s.substring(3, 16);
        String s3 = s.substring(17);

        System.out.println("\n" + s1);
        System.out.println(s2);
        System.out.println(s3 + "\n");

        for(int i=0; i<s.length(); i++){

            System.out.println(i + " -> " + s.charAt(i));
        }
    }
}