package coj.java;

/*
1179 - Optimal Parking
Description: http://coj.uci.cu/24h/problem.xhtml?pid=1179
*/

import java.util.Scanner;
import java.util.TreeSet;

public class P1179 {
    
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        byte testCases = sc.nextByte();
        
        for (byte i = 0; i < testCases; i++) {
            
            byte numStores = sc.nextByte();
                       
            TreeSet<Byte> xi = new TreeSet<>();
            
            for (byte j = 0; j < numStores; j++) {
                
                xi.add(sc.nextByte());
                
            }
            
            int minDistance = 999999;
            
            for(byte parkingPos: xi) { 
                
                int localDistance = 0;
                int left = 0;
                int right = 0;
                
                if(parkingPos != xi.first()) {
                    left += (parkingPos - xi.first());
                }
                
                if(parkingPos != xi.last()) {
                    right += (xi.last() - parkingPos);
                }
                
                localDistance = (left + right) * 2;
                
                if(localDistance < minDistance) {
                    minDistance = localDistance;
                }
                
            }
            
            System.out.println(minDistance);
            
        }
        
    }
    
}
