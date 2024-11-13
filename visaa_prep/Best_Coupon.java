import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        if(x<100)
            System.out.println(x-(x/10));
        int dis=100;
        int d=(10*x)/100;
        if(d>100)
            dis=d;
        System.out.println(x-dis);
    }
}
