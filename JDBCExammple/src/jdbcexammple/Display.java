/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbcexammple;

import java.sql.*;

public class Display {

    static String driver = "com.mysql.cj.jdbc.Driver";
    static String url = "jdbc:mysql://localhost:3306/";
    static String db = "java";
    static String user = "root";
    static String pass = "";
    
    public void ShowData(){
        Connection conn = null;
        Statement st = null;

        ResultSet set = null;

        try {
            conn = DriverManager.getConnection(url + db, user, pass);
            if (conn != null) {
//                System.out.println("DatabaseConnected.");
//                String ins="INSERT INTO students(id,fullname,email,phoneno,gender,title) VALUES(?,?,?,?,?,?)";
//               PreparedStatement ps =conn.prepareStatement(ins);
//                ps.setInt(1,11);
//                  ps.setString(2,"BIKRAM bhattrai");
//                  ps.setString(3,"BIKRAMbhattrai@gmail.com");
//                 ps.setString(4,"9849456690");
//                  ps.setString(5,"MALE");
//                   ps.setString(6,"ENINEERING");
//                   
//                  int rs =ps.executeUpdate();
//                 
//                   ps.setInt(1,21);
//                  ps.setString(2,"RAM GHIMIRE");
//                  ps.setString(3,"ramgimire7@gmail.com");
//                 ps.setString(4,"98890078");
//                  ps.setString(5,"male");
//                   ps.setString(6,"science");
//                    int r =ps.executeUpdate();
//                  System.out.println(r +"rows are affected");
//                   
//                String Ssql = "SELECT * FROM students";
//                st = conn.createStatement();
//                set = st.executeQuery(Ssql);
//                while (set.next()) {
//                   System.out.println(set.getString("id")+","+set.getString("fullname")+","+set.getString("email")+","+set.getString("phoneno")+","+set.getString("gender")+","+set.getString("title"));
//                  
//            }
//            
//                
//            

//                   
//     
             String Udsql = "UPDATE students SET email = ? WHERE fullname=?";
//
               PreparedStatement Ups = conn.prepareStatement(Udsql);
                Ups.setString(1, "jitenrai@gmail.com");
                Ups.setString(2, "BIKRAM bhattrai");
//
                int rowsUpdated = Ups.executeUpdate();
                if (rowsUpdated > 0) {
                    System.out.println("An existing student was updated successfully!");
                }
//                
//                
                String delsql = "DELETE FROM students WHERE gender = ?";
//
                PreparedStatement statem = conn.prepareStatement(delsql);
                statem.setString(1, "male");
//
              int rowsDeleted = statem.executeUpdate();
                if (rowsDeleted > 0) {
                    System.out.println("An existing student was deleted successfully!");
               }
        }
       }
            
    catch(SQLException e){
            System.out.println(e);

    }
        
    }

    public static void main(String[] args) {
        Display d =new Display();
        d.ShowData();
        

        
    }
}

