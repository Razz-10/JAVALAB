package rmiexample2;
import java.rmi.*;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;



public class ServerRMI {
    public static void main(String[] a){
        try{
            
            
        Adder skeleton = new ImpAdder();
        
        Registry registry =LocateRegistry.createRegistry(9000);
        
  registry.rebind("Adder",skeleton);
        }
        catch(RemoteException e){
            System.out.println(e);
        }
    }

  
}
