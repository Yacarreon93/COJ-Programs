package coj.java;

/*
1808 - Hamming Distance
Description: http://coj.uci.cu/24h/problem.xhtml?pid=1808
*/

import java.util.Scanner;

public class P1808 {
    
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        String s1 = sc.next();
        
        while(!s1.equals("X")) {
            
            short distance = 0;
            
            String s2 = sc.next();
            
            for (short i = 0; i < s2.length(); i++) {
                
                if(s2.charAt(i) != s1.charAt(i)) {
                    distance++;
                }
                
            }
            
            System.out.println("Hamming distance is " + distance + ".");
            
            s1 = sc.next();
            
        }
        
    }
    
}
