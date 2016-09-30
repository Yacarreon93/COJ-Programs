package coj.java;

/*
2148 - Quadratic Equations
Description: http://coj.uci.cu/24h/problem.xhtml?pid=2148
*/

import java.util.Scanner;

public class P2148 {
    
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        byte testCases = sc.nextByte();
        
        for (byte i = 0; i < testCases; i++) {
            
            short a = sc. nextShort();
            short b = sc. nextShort();
            short c = sc. nextShort();
            
            int d = (int)(Math.pow(b, 2) - 4 * (a * c));
            
            if (d > 0) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
            
        }
        
    }
    
}
