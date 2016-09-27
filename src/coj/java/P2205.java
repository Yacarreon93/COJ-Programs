package coj.java;

/*
2205 - Counting Ones
Description: http://coj.uci.cu/24h/problem.xhtml?pid=2205
*/

import java.util.Scanner;

public class P2205 {
    
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int cases = sc.nextInt();
        
        for (int i = 0; i < cases; i++) {
            
            short a = sc.nextShort();
            short b = sc.nextShort();
            
            int count = 0;
            
            for (int j = a; j <= b; j++) {                                
                
                String binaryString = Integer.toBinaryString(j); 
                
                for (int k = 0; k < binaryString.length(); k++) {
                    
                    if(binaryString.charAt(k) == '1') {
                        count++;
                    }
                    
                }
                
            }
                        
            System.out.println(count);
            
        }
        
    }
    
}
