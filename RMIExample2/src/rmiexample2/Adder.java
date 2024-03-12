package rmiexample2;
import java.rmi.*;
public interface Adder extends Remote {
     public int Add(int a,int b) throws RemoteException;
    
}
