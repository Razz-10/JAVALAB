/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
public class ServerRMI {
    
    public static void main(String[] a){
        try{
            
            
        Adder skeleton = (Adder) new ImpAdder();
        
        Registry registry =LocateRegistry.createRegistry(7000);
        
  registry.rebind("Adder",skeleton);
        }
        catch(RemoteException e){
            System.out.println(e);
        }
    }
    
}
