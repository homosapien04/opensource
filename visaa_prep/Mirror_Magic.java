import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[][] m=new int[n][n];
        int[][] r=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                m[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                r[i][n-1-j]=m[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                System.out.print(r[i][j] + " ");
            System.out.println();
        }
    }
}
