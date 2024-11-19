import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
}
        int lw=0;
        int rw=0;
        for(int i=0; i<n;i++){
            lw=0;
            rw=0;
            for(int j=0;j<i;j++){
                lw+=a[j];
            }
            for(int k=i+1;k<n;k++){
                rw+=a[k];
            }
            int ans=lw-rw;
            if(ans<0)
                ans=-1*ans;
            System.out.print(ans+" ");
        }
    }
}
