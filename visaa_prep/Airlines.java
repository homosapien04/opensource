import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int n=s.nextInt();
        int t=n/100;
        int r=t-x;
        if(n%100==0)
            System.out.println(r);
        else
            System.out.println(r+1);
    }
}
