/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class LoginServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response){
//        String name =request.getParameter("name");
//        String password=request.getParameter("password");
         //response.setContentType("text/html;charset=UTF-8");
         
             
        try{
        PrintWriter out =response.getWriter();
        out.println("Name:"+request.getParameter("name"));
        out.print("Pasword:"+request.getParameter("password"));
        
        
        
//        Cookie c1 = new Cookie("name","raj");
//         c1.setMaxAge(60*60*24);
//         response.addCookie(c1);
//         
//         String myname =c1.getName();
//         String myvalue=c1.getValue();
//         
//         out.println(myname+":"+myvalue);
         
         
         
        
        
         
        
    }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    
}
