///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
// */
//package jdbcexammple;
//import java.sql.*;
//
///**
// *
// * @author Lenovo
// */
//public class JDBCExammple {
//    
//  static String driver ="com.mysql.cj.jdbc.Driver";
//  static  String url="jdbc:mysql://localhost:3306/";
//  static String db="java";
//  static String user="root";
//  static String pass="";
//   
//   
//   
//    public static void main(String[] args) {
//        // TODO code application logic here
//        
//        Connection conn= null;
//        try{
//            conn=DriverManager.getConnection(url+db, user, pass);
//            if(conn !=null){
//                System.out.println("DatabaseConnected.");
//            }
//            
//            
//            
//        }
//        catch(SQLException e){
//            System.out.println(e);
//            
//        }
//    }
//    
//}
