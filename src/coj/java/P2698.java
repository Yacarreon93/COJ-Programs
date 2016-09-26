package coj.java;

/*
2698 - A+B=C
Description: http://coj.uci.cu/24h/problem.xhtml?pid=2698
*/

import java.util.Scanner;

public class P2698 {
    
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        String word = sc.nextLine();
        char[] letters = word.trim().toCharArray();
        
        short number = 0;
        
        for(char letter : letters) {
            
            number += (short)letter - 64;
            
        }
        
        System.out.println(number);
        
    }
    
}
