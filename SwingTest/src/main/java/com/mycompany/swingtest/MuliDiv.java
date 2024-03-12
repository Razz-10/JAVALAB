/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.swingtest;

/**
 *
 * @author Lenovo
 */
import javax.swing.*;
import java.awt.event.*;

class Form extends JFrame {
    
    
    JFrame f = new JFrame();
    JTextField t1;
    JTextField t2;
    JLabel l3;
    Form(){
        
        JLabel l1=new JLabel("Enter first number:");
        l1.setBounds(20,20,150,20);
        f.add(l1);
        
        
    t1=new JTextField();
     t1.setBounds(190,20,100,20);
     f.add(t1);
     
     JLabel l2 =new JLabel("Enter Second Number:");
     l2.setBounds(20, 60, 150,20);
     f.add(l2);
     
      t2=new JTextField();
      t2.setBounds(190,60,100,20);
      f.add(t2);
      
      JButton b1=new JButton("M");
      b1.setBounds(120,100,70,20);
      
      
      JButton b2=new JButton("D");
      b2.setBounds(200,100,70,20);
      
      
      l3=new JLabel("Result");
      l3.setBounds(120,140,70,20);
      f.add(l3);
      
      b1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            int n1=Integer.parseInt(t1.getText());
            int n2=Integer.parseInt(t2.getText());
            int result = n1*n2;
            l3.setText("Multil="+result);
        }
        });
      f.add(b1);
      
      b2.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            int n1=Integer.parseInt(t1.getText());
            int n2=Integer.parseInt(t2.getText());
            double division  = n1/n2;
            l3.setText("Division="+String.valueOf(division));
        }
        });
      f.add(b2);
      
      
      
      f.setSize(200,300);
        f.setLayout(null);
        f.setVisible(true);
    
    
}
}
    
    public class MuliDiv{
        public static void main(String[] args){
            Form form=new Form();
        }
    }
    
    
  
