package coj.java;

/*
2091 - Counting Task
Description: http://coj.uci.cu/24h/problem.xhtml?pid=2091
*/

import java.util.Scanner;
import java.util.HashSet;

public class P2091 {
    
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        short testCases = sc.nextShort();
        
        for (int i = 0; i < testCases; i++) {
            
            String line = sc.next();                      
            
            HashSet<Character> differentChars = new HashSet<>();
            
            for (int j = 0; j < line.length(); j++) {
                
                differentChars.add(line.charAt(j));
                
            }
            
            System.out.println(differentChars.size());
            
        }
        
    }
    
}
