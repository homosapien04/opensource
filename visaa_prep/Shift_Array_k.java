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
        int k=s.nextInt();
        k=k%n;
        rotate(a,n,k);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void rotate(int[] a,int n,int k){
        rev(a,0,n-k-1);
        rev(a,n-k,n-1);
        rev(a,0,n-1);
    }
    
    public static void rev(int[] a,int st,int end){
        while(st<=end){
            int t=a[st];
            a[st]=a[end];
            a[end]=t;
            st++;
            end--;
        }
    }
}
