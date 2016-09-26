package coj.java;

/*
1842 - Distance of Manhattan
Description: http://coj.uci.cu/24h/problem.xhtml?pid=1842
*/

import java.util.Scanner;

public class P1842 {
    
    private static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        short t = in.nextShort();
        
        for (int i = 0; i < t; i++) {
            
            short x1 = in.nextShort();
            short y1 = in.nextShort();
            short x2 = in.nextShort();
            short y2 = in.nextShort();
            
            int res = Math.abs(x2 - x1) + Math.abs(y2 - y1);
            
            System.out.println(res);
            
        }                
        
    }
    
}
