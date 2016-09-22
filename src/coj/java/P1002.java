package coj.java;

/*
COJ Problem
1002 - New House

Description: 
Johan wants to build a new house and he wants his house as large as it can.
Given an N x N grid land, find the largest square size that fit in the free area.

Input:
The first line of input contains an integer T (1 <= T <= 100), the number of test cases follow. 
Each test case starts with an integer N <= 10 denoting the size of the grid land. 
The next N lines each contains N characters. Each character be either '.' (free area) or '#' (obstacle). 
Your house should be build on free area.

Output:
For each test case, output in a line the size of the largest square on free area.
*/

import java.util.*;

public class P1002 {
    
    private static Scanner sc = new Scanner(System.in);
    private static char[][] terrain;
    
    public static void main(String[] args) {
        
        int cases = sc.nextInt();
        for (short i = 0; i < cases; i++) {  
            
            short max = 0;
            short terrain_size = sc.nextShort();
            terrain = new char[10][];
            
            // Utility
            short temp_max;
            boolean is_square;
            short aux_pos;            
            
            for (short j = 0; j < terrain_size; j++) {                
                String line = sc.next();
                terrain[j] = line.toCharArray();                
            } 
            
            temp_max = 0;
            
            for (short y = 0; y < terrain_size - 1; y++) {
                for (short x = 0; x < terrain_size - 1; x++) { 
                                       
                    if(terrain[y][x] == '.') {
                        
                        temp_max = 1;
                        is_square = true;
                        aux_pos = 0;
                                                
                        do {      
                            
                            aux_pos++;   
                            if(y + aux_pos < terrain_size && x + aux_pos < terrain_size) {
                                
                                if(terrain[y + aux_pos][x + aux_pos] == '.') {
                                
                                    if(validThroughXY(x, y, (short)(x + aux_pos), (short)(y + aux_pos))) {
                                        temp_max ++;
                                    } 
                                    else {
                                        is_square = false;
                                    } 

                                }
                                else {
                                    is_square = false;
                                }  
                                
                            }
                            else {
                                break;
                            }                            
                            
                        } while(is_square);                        
                    }  
                    if(temp_max > max) max = temp_max;
                }
            } 
            System.out.println(max);
        }        
    }   
    
    public static boolean validThroughXY(short x_start, short y_start, short x_end, short y_end) {
        return validThroughX(x_start, x_end, y_end) && validThroughY(y_start, y_end, x_end);        
    }
    
    public static boolean validThroughX(short x_start, short x_end, short y) {
        for (short x = x_start; x < x_end; x++) {
            if(terrain[y][x] != '.') {
                return false;
            }
        }
        return true;
    }
    
    public static boolean validThroughY(short y_start, short y_end, short x) {
        for (short y = y_start; y < y_end; y++) {
            if(terrain[y][x] != '.') {
                return false;
            }
        }
        return true;
    }
    
}
