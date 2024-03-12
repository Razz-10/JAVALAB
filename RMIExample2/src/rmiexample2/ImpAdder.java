package rmiexample2;
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
