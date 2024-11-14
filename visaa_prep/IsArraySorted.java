import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        long c=0;
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        for(int i=1;i<n;i++){
            if(a[i-1]>a[i])
                c+=1;
        }
        if(c==0)
            System.out.println("true");
        else
            System.out.println("false");
        }
}
