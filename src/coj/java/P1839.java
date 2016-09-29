package coj.java;

/*
1839 - A Funny Task
Description: http://coj.uci.cu/24h/problem.xhtml?pid=1839
*/

import java.util.Scanner;

public class P1839 {
    
    private static Scanner sc = new Scanner(System.in);
        
    public static void main(String[] args) {
        
        short cases = sc.nextShort();
        
        for (int i = 0; i < cases; i++) {
            
            short finalOranges = sc.nextShort();
            
            int initOranges = finalOranges;
            
            for (int j = 0; j < 3; j++) {
                initOranges = (initOranges + 3) * 2; 
            }  
            
            System.out.println(initOranges);
            
        }
        
    }
    
}
