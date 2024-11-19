import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        long x=s.nextLong();
        long y=s.nextLong();
        if(x>=y)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
