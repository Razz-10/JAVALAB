/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rmi;
import java.rmi.server.*;
import java.rmi.*;

public class ImpAdder extends UnicastRemoteObject implements Adder {
     public ImpAdder() throws RemoteException{
        super();
    }
    
    @Override
    public int Add(int a,int b) throws RemoteException{
        return a+b;
    }
    
    
}
