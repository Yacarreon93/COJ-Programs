package coj.java;

/*
1212 - Jingle Composing

Description:
A. C. Marcos is taking his first steps in the direction of jingle composition. 
He is having some troubles, but at least he is achieving pleasant melodies and attractive rhythms. 
In music, a note has a pitch (its frequency, resulting in how high or low is the sound) and a duration (for how long the note should sound). 
In this problem we are interested only in the duration of the notes. 
A jingle is divided into a sequence of measures, and a measure is formed by a series of notes. 
The duration of a note is indicated by its shape. In this problem, we will use uppercase letters to indicate a note duration. 
The following table lists all the available notes: 

    W = 1, H = 1/2, Q = 1/4, E = 1/8, S = 1/16, T = 1/32, X = 1/64

The duration of a measure is the sum of the durations of its notes. In Marcos jingles, each measure has the same duration. 
As Marcos is just a beginner, his famous teacher Johann Sebastian III taught him that the duration of a measure must always be 1.
For example, Marcos wrote a composition containing five measures, of which the first four have the correct duration and the last one is wrong.
In the example below, each measure is surrounded with slashes and each note is represented as in the table above.

    /HH/QQQQ/XXXTXTEQH/W/HW

Marcos likes computers as much as music. He wants you to write a program that determines, for each one of his compositions, how many measures have the right duration.

Input:
The input contains several test cases. Each test case is described in a single line containing a string whose length is between 3 and 200 characters, inclusive, representing a composition. 
A composition begins and ends with a slash "/". Measures in a composition are separated by a slash "/". Each note in a measure is represented by the corresponding uppercase letter, as described above. 
You may assume that each composition contains at least one measure and that each measure contains at least one note. 
All characters in the input will be either slashes or one of the seven uppercase letters used to represent notes, as described above. 
The last test case is followed by a line containing a single asterisk.

Output:
For each test case your program must output a single line, containing a single integer, the number of measures that have the right duration.
*/

import java.util.Scanner;

public class P1212 {
    
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        String composition;
        String[] measures;
        int total;
        
        composition = sc.nextLine();
        
        while(!composition.equals("*")) {
            
            total = 0;
            measures = composition.substring(1, composition.length() - 1).split("/");           
            
            for (String measure : measures) {
                
                float duration = 0;
                
                char[] notes = measure.toCharArray();
                
                for (char note: notes) {                  
                        
                    switch (note) {
                        case 'W':
                            duration += 1f;
                            break;
                        case 'H':
                            duration += (float)1/(float)2;
                            break;
                        case 'Q':
                            duration += (float)1/(float)4;
                            break;
                        case 'E':
                            duration += (float)1/(float)8;
                            break;
                        case 'S':
                            duration += (float)1/(float)16;
                            break;
                        case 'T':
                            duration += (float)1/(float)32;
                            break;
                        case 'X':
                            duration += (float)1/(float)64;
                            break;
                        default:
                            break;
                    }                                                                             
                    
                }
                
                if(duration == 1f) {
                    
                    total++;
                    
                }
                
            }
            
            System.out.println(total);
            composition = sc.nextLine();
            
        }
      
    }
    
}
