import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        String st=s.nextLine();
        int n=st.length();
        int ans=0;
        for(int i=0;i<n/2;i++){
            if(st.charAt(i)!=st.charAt(n-1-i)){
                ans=0;
                break;}
            else{
                ans=1;
                continue;}
        }
        if(ans==1)
            System.out.println("TRUE");
        else
            System.out.println("FALSE");
    }
}
