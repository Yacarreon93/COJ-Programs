package coj.java;

/*
1445 - What's Next?
Description: http://coj.uci.cu/24h/problem.xhtml?pid=1445
*/

import java.util.Scanner;

public class P1445 {
    
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        short a, b, c;
        
        a = sc.nextShort();
        b = sc.nextShort();
        c = sc.nextShort();
        
        while(a != 0 || b != 0 || c != 0) {
            
            boolean cond1 = ((double)b / (double)a) % 1 == 0;
            boolean cond2 = ((double)c / (double)b) % 1 == 0;
            boolean cond3 = ((double)c / (double)b) == ((double)b / (double)a);
            
            if(cond1 && cond2 && cond3) {
                
                System.out.println("GP " + (c * (b / a)));
                
            } else {
                
                System.out.println("AP " + (c + (b - a)));
                
            }
            
            a = sc.nextShort();
            b = sc.nextShort();
            c = sc.nextShort();
            
        }
        
    }
    
}
