import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        String a = s.nextInt();
        String b = s.nextInt();
        char v = a.charAt(0);
        char c = b.charAt(0);
        if(v==c)
            System.out.println("NULL");
        else if((v=='P' && c=='R')||(v=='S' && c=='P')||(v=='R' && c=='S'))
            System.out.println("Vignesh");
        else
            System.out.println("Charan");
        
    }
}
