import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int div = 0;
        int ndiv=0;
        for(int i=0;i<n;i++){
            if(arr[i]%m==0)
                div+=arr[i];
            else
                ndiv+=arr[i];
}
        System.out.println(div-ndiv);
        
    }
}
