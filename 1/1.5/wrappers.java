public class wrappers {
    public static void main(String[] args){

        int i = 52;  

        System.out.println(i+2);

        String sI = Integer.toString(i); // convert a int to string with wrappers

        System.out.println(sI + 2);

        System.out.println(sI.charAt(0));

        int i2 = Integer.parseInt(sI); // convert a string to int with w

        System.out.println(i2 + 2);
    }
}