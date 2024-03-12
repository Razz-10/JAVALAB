/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.labwork;

import java.io.*;
public class Labwork {

    public static void main(String[] args) {
        try {
            // Create a BufferedReader to read input from the user
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            // Read the input string from the user
            System.out.print("Enter a string: ");
            String inputString = br.readLine();
            
            // Close the BufferedReader
            br.close();
            
            // Separate vowels and consonants
            String vowels = "";
            String consonants = "";
            
            for (char ch : inputString.toLowerCase().toCharArray()) {
                if (ch >= 'a' && ch <= 'z') {
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        vowels += ch;
                    } else {
                        consonants += ch;
                    }
                }
            }           
            // Write the vowels to VOWEL.TXT
            FileWriter vowelFileWriter = new FileWriter("VOWEL.TXT");
            vowelFileWriter.write(vowels);
            vowelFileWriter.close();
            
            // Write the consonants to CONSONANT.TXT
            FileWriter consonantFileWriter = new FileWriter("CONSONANT.TXT");
            consonantFileWriter.write(consonants);
            consonantFileWriter.close();
            
            System.out.println("Vowels have been written to VOWEL.TXT");
            System.out.println("Consonants have been written to CONSONANT.TXT");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
       
    }

