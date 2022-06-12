import java.util.StringTokenizer; // must be set to use StringTokenizer class
import java.util.Scanner;

public class split_strings {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        /* -- STRINGTOKENIZER CLASS --*/

        String s = "Hola|como|estas";
        StringTokenizer st = new StringTokenizer(s,"|");

        String tok;

        while(st.hasMoreTokens()){ // check if there are more tokens

            tok = st.nextToken(); // moves on the next token
            System.out.println(tok);
        
        }
        /* -- STRING SPLIT METHOD -- */

        String s1 = "Mi|gato|se|llama|ruperto";
        String tokens[] = s1.split("[|]");

        for(int i=0; i<tokens.length; i++){
            
            System.out.println(tokens[i]);
        }
        
    }
}