import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x[] = new int[n];
        double sum = 0.0;
        for(int i = 0;i < n;i++){
            x[i] = sc.nextInt();
            sum += x[i];
            }
            double mean = sum / n;
            sum = 0.0;
            for(int i = 0;i < n;i++)
                sum += Math.pow(x[i] - mean,2);
            double deviation = Math.sqrt(sum / n);
            System.out.println(String.format("%.1f",deviation));
    }
}
