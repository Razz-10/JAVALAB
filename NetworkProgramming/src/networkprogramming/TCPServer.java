/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package networkprogramming;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;

public class TCPServer {
    public static void main(String[] args) {
        try{
           ServerSocket server = new ServerSocket(3000);
           Socket c = server.accept();
           System.out.println(c +"client is connected");
           
           DataInputStream input =new DataInputStream(c.getInputStream());
           
           DataOutputStream out = new DataOutputStream(c.getOutputStream());
           String message =(String)input.readUTF();
           System.out.println(message);
           out.writeUTF("hello client");
           
           
           c.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    
}
