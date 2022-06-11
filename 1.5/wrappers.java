public class wrappers {
    public static void main(String[] args){

        int i = 52;  

        System.out.println(i+2);

        String sI = Integer.toString(i);

        System.out.println(sI + 2);

        System.out.println(sI.charAt(0));

        int i2 = Integer.parseInt(sI);

        System.out.println(i2 + 2);
    }
}