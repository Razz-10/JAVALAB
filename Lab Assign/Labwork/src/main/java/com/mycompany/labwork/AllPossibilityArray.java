/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labwork;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class AllPossibilityArray {
     public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n]; // Create an integer array of size 'n'

        System.out.println("Enter " + n + " integers:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt(); // Read integers one by one
        }
        
        int res = isAllPossibilities(arr);
        
        if (res == 1){
            System.out.println("The array is all possible array  since Allpossiblity Method Return : " + res);
        }else{
            System.out.println("The array is not possible since Allpossiblity Method Return : " +  res);
        }
        
    }
    
    public static int isAllPossibilities(int[] array){
        int output = 1;
        for(int i =0 ; i < array.length ;i++){
            if(indexOf(array,i) == -1){
                output = 0;
                break;
            }
        }
        return output;
    }
    
     public static int indexOf(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; 
            }
        }
        return -1; 
    }
}
    

