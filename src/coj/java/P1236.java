package coj.java;

/*
1236 - About Dogs and a Postman
Description: http://coj.uci.cu/24h/problem.xhtml?pid=1236
*/

import java.util.Scanner;

public class P1236 {

    private static Scanner sc = new Scanner(System.in);
    private static short a, b, c, d;
    
    public static void main(String[] args) {

        short p, m, g;
        
        a = sc.nextShort();
        b = sc.nextShort();
        c = sc.nextShort();
        d = sc.nextShort();
        p = sc.nextShort();
        m = sc.nextShort();
        g = sc.nextShort();
               
        System.out.println(getAttackerDogs(p));
        System.out.println(getAttackerDogs(m));
        System.out.println(getAttackerDogs(g));
                
    }
    
    static String getAttackerDogs(int personArrive) {
        
        String attackerDogs = "";                
        boolean aggresive = true;
        byte attacked = 0;
        short time = 0;
                
        while(time < personArrive) {
                        
            if(aggresive) {
                
                time += a;
                if(personArrive <= time) {
                    attacked++;
                    break;
                }
                aggresive = false;
                
            } else {                
                time += b;
                aggresive = true;
            }
            
        }   
        
        aggresive = true;
        time = 0;
        
        while(time < personArrive) {
                        
            if(aggresive) {
                
                time += c;
                if(personArrive <= time) {
                    attacked++;
                    break;
                }
                aggresive = false;
                
            } else {                
                time += d;
                aggresive = true;
            }
            
        }  
        
        switch(attacked) {
            case 0: attackerDogs = "none"; break;
            case 1: attackerDogs = "one"; break;
            case 2: attackerDogs = "both"; break;
        }
        
        return attackerDogs;
        
    }
    
}
