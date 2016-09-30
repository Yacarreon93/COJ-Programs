package coj.java;

/*
1840 - Broken Strings
Description: http://coj.uci.cu/24h/problem.xhtml?pid=1840
*/

import java.util.Scanner;

public class P1840 {
    
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
    
        short testCases = sc.nextShort();
        
        for (short i = 0; i < testCases; i++) {
            
            String password = sc.next();
            char[] chars = password.toCharArray();
            
            int[] broken = new int[6];
            
            for (char c : chars ) {
                
                switch(c) {
                    case 'B':
                        broken[0]++;
                        break;
                    case 'R':
                        broken[1]++;
                        break;
                    case 'O':
                        broken[2]++;
                        break;
                    case 'K':
                        broken[3]++;
                        break;
                    case 'E':
                        broken[4]++;
                        break;
                    case 'N':
                        broken[5]++;
                        break;
                }                                
                
            }
            
            boolean insecure = true;
            
            for (int j = 0; j < broken.length; j++) {
                if(broken[j] != 1) {
                    insecure = false;
                }
            }
            
            if(insecure) System.out.println("No Secure");
            else System.out.println("Secure");
            
        }
        
    }
    
}
