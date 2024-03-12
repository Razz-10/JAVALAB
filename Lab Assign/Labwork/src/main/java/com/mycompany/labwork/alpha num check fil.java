/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labwork;

import java.io.*;

/**
 *
 * @author Lenovo
 */
public class classeg {
    
    
     public static void main(String[] args) {
        try{
            // Create a BufferedReader to read input from the user
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            // Read the input string from the user
            System.out.print("Enter a string(only alphabet and numbers are allowed: ");
            String inputString = br.readLine();
            
            // Close the BufferedReader
            br.close();
            
            // Separate vowels and consonants
            String num = "";
            String alphabet = "";
            
            for (char ch : inputString.toLowerCase().toCharArray()) {
                if (ch >= 'a' && ch <= 'z') {
                        alphabet += ch;
                    } else {
                        num += ch;
                    }
                }
                 
           
            
            // Write the consonants to CONSONANT.TXT
            FileWriter alphabetFileWriter = new FileWriter("alphabet.TXT");
            alphabetFileWriter.write(alphabet);
            alphabetFileWriter.close();
            
             // Write the vowels to VOWEL.TXT
            FileWriter numFileWriter = new FileWriter("num.TXT");
            numFileWriter.write(num);
            numFileWriter.close();
            
            
            System.out.println("numbers have been written to num.TXT");
            System.out.println("alphabet have been written to alphabet.TXT");
        }    
        
     catch (IOException e) {
            e.printStackTrace();
        }
     }
    }
       







