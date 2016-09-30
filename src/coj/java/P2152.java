package coj.java;

/*
2152 - Sum of the Digits
Description: http://coj.uci.cu/24h/problem.xhtml?pid=2152
*/

import java.util.Scanner;

public class P2152 {    

    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        short testCases = sc.nextShort();
        
        for (short i = 0; i < testCases; i++) {
            
            String number = sc.next();
            
            int sum = 0;
            
            char[]digits = number.toCharArray();
            
            if(digits[0] == '-') {
                digits [0] = '0';
            } 
            
            for(char digit : digits) {                                
                
                sum += Character.digit(digit, 10);
                
            }
            
            System.out.println(sum);
            
        }
        
    }
    
}
