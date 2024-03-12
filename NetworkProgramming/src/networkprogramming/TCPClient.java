/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package networkprogramming;
import java.net.*;
import java.io.*;

public class TCPClient {
    public static void main(String[] s){
        try{
            Socket socket = new Socket("192.168.1.82",3000);
            System.out.println(socket + "Server is connected");
            
            DataOutputStream out =new DataOutputStream(socket.getOutputStream());
            DataInputStream in = new DataInputStream (socket.getInputStream());
            out.writeUTF("Hello hy namastey "+ "");
            String message = in.readUTF();
            System.out.println(message);
            socket.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
