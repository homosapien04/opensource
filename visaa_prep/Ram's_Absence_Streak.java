import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int c=0;
        int m=0;
        for(int i=0;i<n;i++){
            if(a[i]==0){
                c+=1;
                m=Math.max(c,m);}
            else
                c=0;
        }
        System.out.println(m);
    }
}
