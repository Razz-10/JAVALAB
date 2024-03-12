/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package networkprogramming;
import java.net.*;
import java.io.*;

public class URLConnectionTest {
    public static void main(String[] args){
        
        try{
            URL url = new  URL("https://nagarjunacollege.edu.np/post/about-us");
            URLConnection con =url.openConnection();
            InputStream input =con.getInputStream();
            int i;
            while((i=input.read()) !=-1){
                System.out.print((char)i);
            }
            
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
