import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int ans=0;
        while(n!=0){
            int rem=n%10;
            n=n/10;
        if(ans>Integer.MAX_VALUE || rem>7){
           ans=0;
            break;
        }
            else{
                ans=ans*10+rem;
            }
        }
        System.out.println(ans);
    }
}
