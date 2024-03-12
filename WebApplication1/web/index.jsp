<%-- 
    Document   : test
    Created on : Dec 20, 2023, 7:09:48 AM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
<!--        <h1>Hello World!</h1>-->
        
        <%--JSP Comments 
        <%! int i=0; %>
        <% for(i=0;i<5;i++)
        {%>
       <h2>TRIBHUWAN UNIVERSITY</h2>
           <% }%> --%>
        
        <form method ="post" action="LoginServlet">
           Name <input type="text" name="name">
           <br>
            Password <input type="password" name="password">
            <br>
            <input type="submit" value="Submit">
            
        </form>
    </body>
</html>
