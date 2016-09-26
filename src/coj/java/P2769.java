package coj.java;

/*
2769 - Engineer's Day
Description: http://coj.uci.cu/24h/problem.xhtml?pid=2769
*/

import java.util.Scanner;

public class P2769 {
    
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        short n = sc.nextShort();
        
        if(n > 0) {
            
            for (short i = 1; i <= n; i++) {

                System.out.format("%d: I am participating in the Engineer's day.\n", i);

            }
            
        }               
        
    }
    
}
