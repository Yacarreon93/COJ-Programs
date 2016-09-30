package coj.java;

/*
1025 - Democracy in Danger
Description: http://coj.uci.cu/24h/problem.xhtml?pid=1025
*/

import java.util.TreeMap;
import java.util.Map;
import java.util.Scanner;

public class P1025 {
    
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        byte groupsQty = sc.nextByte();
        
        Map<Short, Short> groups = new TreeMap<>();
        
        for (byte i = 0; i < groupsQty; i++) {
            
            short peopleInGroup = sc.nextShort();
            
            if(groups.containsKey(peopleInGroup)) {
                
                groups.put(peopleInGroup,(short)(groups.get(peopleInGroup) + 1));
                // groups.replace(peopleInGroup, groups.get(peopleInGroup), (short)(groups.get(peopleInGroup) + 1));
                
            } else {
                
                groups.put(peopleInGroup,(short)1);
                
            }            
        }       
        
        short groupsToWin = (short)((groupsQty / 2) + 1);        
        short supporters = 0;
            
        counter:
        for (Map.Entry<Short, Short> entry : groups.entrySet()) {                             
                        
            for (int i = 0; i < entry.getValue(); i++) {
                
                if(groupsToWin > 0) {
                
                    groupsToWin--;
                    supporters += (entry.getKey() / 2) + 1;

                } else { break counter; }
                
            }
            
        }              
        
        System.out.println(supporters);
        
    }
    
}
