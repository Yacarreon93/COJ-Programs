package coj.java;

/*
1132 - Divisor Summation
Description: http://coj.uci.cu/24h/problem.xhtml?pid=1132
*/

import java.util.Scanner;

public class P1132 {
    
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int cases = sc.nextInt();
        
        for (int i = 0; i < cases; i++) {
            
            int n = sc.nextInt();
            int summation = 0;
            
            for (int j = 1; j < n; j++) {
                
                if(n % j == 0) {
                    summation += j;
                }
                
            }
            
            System.out.println(summation);
            
        }
        
    }
    
}
