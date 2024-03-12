///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package jdbcexammple;
//import javax.swing.*;
//import java.awt.event.*;
//import java.sql.*;/**
// *
// * @author Lenovo
// */
//public class Login {
//    static String driver = "com.mysql.cj.jdbc.Driver";
//    static String url = "jdbc:mysql://localhost:3306/";
//    static String db = "java";
//    static String dbuser = "root";
//    static String dbpass = "";
//    
//    
//    
//    public void Login(){
//        JFrame f=new JFrame("Login");
//        
//        
//        JLabel l1=new JLabel("Username");
//     
//        l1.setBounds(10,10,100,20);
//           f.add(l1);
//        JTextField t1=new JTextField();
//        t1.setBounds(120,10,100,20);
//        f.add(t1);
//        
//        
//         JLabel l2=new JLabel("Password");
//        
//        l2.setBounds(10,40,100,20);
//        f.add(l2);
//        JTextField t2=new JTextField();
//        
//        t2.setBounds(120,40,100,20);
//        f.add(t2);
//        
//        
//        JButton b =new JButton("Login");
//        b.setBounds(120,80,100,20);
//        b.addActionListener(new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent e){
//                String user=t1.getText();
//                String pass=t2.getText();
//                
//                
//                try{
//                   Connection conn = DriverManager.getConnection(url + db, dbuser, dbpass);
//
//                String sql = "Select *from user where username ='"+user+"' and password='"+pass+"'";
//                
//                //String sql  ="Insert into user values(1,"raj",123,"yes")";
//                Statement st= conn.createStatement();
//                ResultSet set = st.executeQuery(sql);
//                int ret=0;
//                
//               
//                while (set.next()) {
//                    //  System.out.println(set.getString(1));
//                    ret=1;
//                }
//                if(ret==1){
//                    Display d =new Display();
//                    d.ShowData();
//                    f.setVisible(false);
//            }
//                else{
//                    JOptionPane.showMessageDialog(f,"LOgin Failed","Error",JOptionPane.ERROR_MESSAGE);
//                }
//        }
//    catch(SQLException ex){
//            System.out.println(ex);
//
//    }
//            }
//        });
//        f.add(b); 
//        f.setSize(300,200);
//        f.setLayout(null);
//        f.setVisible(true);
//        
//        
//    }
//    
//    public static void main(String[] args){
//        Login log=new Login();
//    
//    }
//    
//}
