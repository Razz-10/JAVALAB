/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ClientRMI {
    
      public static void main(String[] s){
        try{
            
            Registry registry = LocateRegistry.getRegistry("localhost", 7000);
            Adder stub =(Adder)registry.lookup("Adder");
            int sum = stub.Add(80,15);
            System.out.println("Return sum ="+sum);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
