package coj.java;

/*
1273 - Domino Factory
Description: http://coj.uci.cu/24h/problem.xhtml?pid=1273
*/

import java.util.Scanner;

public class P1273 {
    
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int testCases = sc.nextInt();
        
        for (int i = 0; i < testCases; i++) {
            
            int n = sc.nextInt();    
            int height = sc.nextInt();
            int width = sc.nextInt();   
            
            int pieces = (n + 1) * (n + 2) / 2;
            
            width = width * pieces;
            
            int area = width * height;
                        
            System.out.println(area);
            
        }
        
    }
    
}
