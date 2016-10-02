package coj.java;

/*
2149 - Balanced Words I
Description: http://coj.uci.cu/24h/problem.xhtml?pid=2149
*/

import java.util.Scanner;

public class P2149 {    
    
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        byte testCases = sc.nextByte();
        
        for (byte i = 0; i < testCases; i++) {
            
            short count = 0;
            
            String word = sc.next();
            
            for (int j = 0; j < word.length(); j++) {
                
                if(Character.isUpperCase(word.charAt(j))) {
                    count++;
                } else {
                    count--;
                }
                
            }
            
            if(count == 0) System.out.println("SI");
            else System.out.println("NO");
            
        }
        
    }
    
}
