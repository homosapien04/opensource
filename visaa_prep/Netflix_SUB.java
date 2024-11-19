import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int x = s.nextInt();
        if(((a+b)>=x)||((b+c)>=x) || ((c+a)>=x))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
