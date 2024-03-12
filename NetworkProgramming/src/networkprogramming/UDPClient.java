/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package networkprogramming;
import java.net.*;

/**
 *
 * @author Lenovo
 */
public class UDPClient {
    public static void main(String[] args){
        
        try{
            byte[] receiveData =new byte[100];
             DatagramSocket socket = new DatagramSocket();
        
        InetAddress inet= InetAddress.getByName("192.168.1.82");
         String message ="HelloIm raj boss  richi";
        
        DatagramPacket sendPacket=new DatagramPacket(message.getBytes(),message.getBytes().length,inet,9999);
        socket.send(sendPacket);
        
        }
        catch(Exception e){
            System.out.println(e);
        }
    
}
}
