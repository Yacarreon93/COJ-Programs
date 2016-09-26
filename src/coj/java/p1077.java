package coj.java;

/*
1077 - The 3n + 1 Problem
Description: http://coj.uci.cu/24h/problem.xhtml?pid=1077
*/

import java.util.Scanner;

public class p1077 {
    
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
                
        while (sc.hasNextInt()) {
            
            int lowerLim;
            int firstInput;
            int upperLim;
            int secondInput;
            int max = 0;

            lowerLim = sc.nextInt();
            firstInput = lowerLim;
            upperLim = sc.nextInt();
            secondInput = upperLim;            
            
            if(lowerLim > upperLim) {
                int temp = lowerLim;
                lowerLim = upperLim;
                upperLim = temp;
            }
            
            for (int i = lowerLim; i <= upperLim; i++) {
                
                int cycleLenght = getCycleLenght(i);
                
                if(cycleLenght > max ){
                    max = cycleLenght;
                }                
            }            
            
            System.out.println(firstInput + " " + secondInput + " " + max);
            
        }                   
                
    }
    
    private static int getCycleLenght(int n) {
        
        int lenght = 1;
        
        while (n != 1) {
            
            if(n % 2 == 0) {
                
                n = n / 2;
                                
            } else {
                
                n = (n * 3) + 1;                 
            }
            
            lenght++;
            
        }
        
        return lenght;
        
    }
    
}
