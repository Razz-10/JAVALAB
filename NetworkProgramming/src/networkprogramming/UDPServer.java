/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package networkprogramming;
import java.net.*;


public class UDPServer {
    public static void main(String[] s){
        byte[] receiveData =new byte[100];
        
        try{
            DatagramSocket socket=new DatagramSocket(8000);
            
            while(true){
            DatagramPacket receivePacket = new DatagramPacket(receiveData,receiveData.length);
            socket.receive(receivePacket);
            String receiveMessage= new String(receivePacket.getData());
            System.out.println("client Message:" + receiveMessage);
            
            
        }
        }
        catch(Exception  e){
            System.out.println(e);
        }
    }    
}
