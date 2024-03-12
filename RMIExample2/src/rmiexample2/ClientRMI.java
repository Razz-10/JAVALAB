package rmiexample2;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.RemoteException;

public class ClientRMI {
    public static void main(String[] s){
        try{
            
            Registry registry = LocateRegistry.getRegistry("localhost", 9000);
            Adder stub =(Adder)registry.lookup("Adder");
            int sum = stub.Add(5,9);
            System.out.println("Return sum ="+sum);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
