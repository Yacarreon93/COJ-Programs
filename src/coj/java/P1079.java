package coj.java;

import java.util.Scanner;

/*
1079 - Sums in a Triangle I

Description:
Let us consider a triangle of numbers in which a number appears in the first line, two numbers appear in the second line, etc. 
Develop a program which will compute the largest of the sums of numbers that appear on the paths starting from the top towards the base, so that: 
On each path the next number is located on the row below, more precisely either directly below or below and one place to the right. 
- The number of rows is strictly positive, but less than 100 and all numbers are positive integers between 0 and 99.

Input:
In the first line integer n - the number of test cases (equal to about 1000). 
Then n test cases follow. Each test case starts with the number of lines which is followed by their content.

Output:
For each test case write the determined value in a separate line.
*/

public class P1079 {
    
    static Scanner sc = new Scanner(System.in);
    static short n;
    static short[][] m;
    static int max;
    
    public static void main(String[] args) {
        
        short t = sc.nextShort();
        
        for(short tt = 0; tt < t; tt++) {
            
            n = sc.nextShort();
            m = new short[n][];
            
            short lenght = 1;
        
            for(short i = 0; i < n; i++) {   

                m[i] = new short[lenght];

                for (short j = 0; j < m[i].length ; j++) {

                    m[i][j] = sc.nextShort();

                }

                lenght++;

            }
            
            short x = 0;
            short y = 0;
            max = 0;
                        
            recursive(x, y, 0);
            
            System.out.println(max);
            
        }
                                            
    }
    
    public static void recursive(short x, short y, int prevAcum) {
        
        int currentAcum = prevAcum + m[y][x];
        
        if(y < n - 1) {                   
            y++;
            recursive(x, y, currentAcum); 
            x++;
            recursive(x, y, currentAcum);
            
        } else {                          
            
            if(currentAcum > max) {
                max = currentAcum;
            }
            
        }
        
    }
    
}
